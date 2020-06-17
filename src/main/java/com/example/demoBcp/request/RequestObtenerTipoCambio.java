package com.example.demoBcp.request;

public class RequestObtenerTipoCambio {

    private Long monedaOrigen;
    private Long monedaDestino;
    private Double monto;

    public Long getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(Long monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public Long getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Long monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
