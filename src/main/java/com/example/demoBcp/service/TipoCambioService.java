package com.example.demoBcp.service;




import com.example.demoBcp.request.RequestObtenerTipoCambio;

import com.example.demoBcp.response.ResponseObtenerTipoCambio;
import io.reactivex.Single;


public interface TipoCambioService {

	public Single<ResponseObtenerTipoCambio> obtenerTipoCambio(RequestObtenerTipoCambio request);

}
