package com.example.demoBcp.response;

public class ResponseObtenerTipoCambio {

    private Double monto;
    private Double montoConTipoCambio;
    private Double tipoCambio;
    private Long monedaOrigen;
    private Long monedaDestino;


    public ResponseObtenerTipoCambio(Double monto, Double montoConTipoCambio, Double tipoCambio, Long monedaOrigen, Long monedaDestino) {
        this.monto = monto;
        this.montoConTipoCambio = montoConTipoCambio;
        this.tipoCambio = tipoCambio;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMontoConTipoCambio() {
        return montoConTipoCambio;
    }

    public void setMontoConTipoCambio(Double montoConTipoCambio) {
        this.montoConTipoCambio = montoConTipoCambio;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

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
}
