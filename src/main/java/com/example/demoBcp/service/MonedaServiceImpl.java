package com.example.demoBcp.service;


import com.example.demoBcp.Dao.MonedaDao;
import com.example.demoBcp.entity.Moneda;
import com.example.demoBcp.entity.TipoCambio;
import com.example.demoBcp.request.RequestObtenerTipoCambio;
import com.example.demoBcp.response.ResponseListarMoneda;
import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import io.reactivex.Single;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MonedaServiceImpl implements MonedaService{

	@Autowired
	MonedaDao monedaDao;

	@Override
	public Single<List<ResponseListarMoneda>> getAllMonedas() {
		return findAllMonedasInRepository().map(this::toMonedaResponseList);





	}

	private Single<List<Moneda>> findAllMonedasInRepository() {
		return Single.create(singleSubscriber -> {
			List<Moneda> monedas = monedaDao.findAll();
			singleSubscriber.onSuccess(monedas);
		});
	}

	private List<ResponseListarMoneda> toMonedaResponseList(List<Moneda> bookList) {
		return bookList
				.stream()
				.map(this::toMonedaResponse)
				.collect(Collectors.toList());
	}

	private ResponseListarMoneda toMonedaResponse(Moneda moneda) {
		ResponseListarMoneda monedaResponse = new ResponseListarMoneda();
		BeanUtils.copyProperties(moneda, monedaResponse);
		return monedaResponse;
	}




}



