package com.example.demoBcp.service;


import com.example.demoBcp.Dao.TipoCambioDao;
import com.example.demoBcp.entity.TipoCambio;
import com.example.demoBcp.request.RequestObtenerTipoCambio;
import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class TipoCambioServiceImpl implements TipoCambioService{

	@Autowired
	TipoCambioDao tipoCambioDao;

	public Single<ResponseObtenerTipoCambio> obtenerTipoCambio(RequestObtenerTipoCambio request) {
		return Single.create(singleSubscriber -> {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String dateString = format.format( new Date()   );

			Optional<TipoCambio> optionalTipoCambio1 =tipoCambioDao.findByFechaCambioAndMoneda_id(dateString,request.getMonedaOrigen());
			Optional<TipoCambio> optionalTipoCambio2 =tipoCambioDao.findByFechaCambioAndMoneda_id(dateString,request.getMonedaDestino());

			if (!optionalTipoCambio1.isPresent() || !optionalTipoCambio2.isPresent())
				singleSubscriber.onError(new EntityNotFoundException());
			else {
				double cambio =  optionalTipoCambio1.get().getCambio() / optionalTipoCambio2.get().getCambio();
				singleSubscriber.onSuccess(new ResponseObtenerTipoCambio(request.getMonto(),request.getMonto()*cambio,cambio,request.getMonedaOrigen(),request.getMonedaDestino()));
			}
		});





	}




}



