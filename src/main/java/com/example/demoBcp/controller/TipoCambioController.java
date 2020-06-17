package com.example.demoBcp.controller;


import com.example.demoBcp.Dao.TipoCambioDao;
import com.example.demoBcp.request.RequestObtenerTipoCambio;
import com.example.demoBcp.response.BaseWebResponse;
import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import com.example.demoBcp.service.TipoCambioService;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/tipocambio")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoCambioController {

	@Autowired
	TipoCambioService tipoCambioService;


	@PostMapping("/obtenerTipoCambio")
	public Single<ResponseEntity<BaseWebResponse<ResponseObtenerTipoCambio>>> obtenerTipoCambio(@RequestBody RequestObtenerTipoCambio request) {
		return tipoCambioService.obtenerTipoCambio(request)
				.subscribeOn(Schedulers.io())
				.map(s -> ResponseEntity
						.ok((BaseWebResponse.successWithData( s))));
	}




}
