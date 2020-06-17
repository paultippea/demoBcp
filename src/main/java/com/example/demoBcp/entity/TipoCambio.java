package com.example.demoBcp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tipo_cambio")
public class TipoCambio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fechacambio")
	private String fechaCambio;

	@JoinColumn(name = "idmoneda", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private  Moneda moneda;

	private Double cambio;
	private boolean estado;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(String fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public Double getCambio() {
		return cambio;
	}

	public void setCambio(Double cambio) {
		this.cambio = cambio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
