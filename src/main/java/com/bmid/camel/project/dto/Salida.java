package com.bmid.camel.project.dto;

import lombok.*;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Salida {
	
	private Entrada entrada;
	private double valorTotal;
	private Long numeroFactura;
	
	public Salida() {
		super();
	}
	public Salida(Entrada entrada, double valorTotal, Long numeroFactura) {
		super();
		this.entrada = entrada;
		this.valorTotal = valorTotal;
		this.numeroFactura = numeroFactura;
	}
	public Entrada getEntrada() {
		return entrada;
	}
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
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
