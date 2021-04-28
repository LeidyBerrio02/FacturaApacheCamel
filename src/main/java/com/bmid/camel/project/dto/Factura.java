package com.bmid.camel.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

	private Persona persona;
	private DetalleFactura detalle;
	private double valorTotal;
	private Long numeroFactura;

	public Factura() {
		super();
	}
	public Factura(Persona persona, DetalleFactura detalle, double valorTotal, Long numeroFactura) {
		super();
		this.persona = persona;
		this.detalle = detalle;
		this.valorTotal = valorTotal;
		this.numeroFactura = numeroFactura;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public DetalleFactura getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleFactura detalle) {
		this.detalle = detalle;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Long getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(Long numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	
	
	
}
