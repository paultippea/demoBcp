package com.example.demoBcp.controller;


import com.example.demoBcp.request.RequestObtenerTipoCambio;
import com.example.demoBcp.response.BaseWebResponse;
import com.example.demoBcp.response.ResponseListarMoneda;
import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import com.example.demoBcp.service.MonedaService;
import com.example.demoBcp.service.TipoCambioService;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/moneda")
@CrossOrigin(origins = "http://localhost:4200")
public class MonedaController {

	@Autowired
	MonedaService monedaService;

	@GetMapping("/listarMoneda")
	public Single<ResponseEntity<List<ResponseListarMoneda>>> listarMonedas() {
		return monedaService.getAllMonedas()
				.subscribeOn(Schedulers.io())
				.map(s -> ResponseEntity
						.ok((s)));
	}




}
