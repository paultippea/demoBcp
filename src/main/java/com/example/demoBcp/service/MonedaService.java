package com.example.demoBcp.service;


import com.example.demoBcp.request.RequestObtenerTipoCambio;
import com.example.demoBcp.response.ResponseListarMoneda;
import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import io.reactivex.Single;

import java.util.List;


public interface MonedaService {

	Single<List<ResponseListarMoneda>> getAllMonedas();

}
