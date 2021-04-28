package com.bmid.camel.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Items {

	private Long idItem;
	private String nombreItem;
	private int cantidad;
	private double valorUnitario;
	
	public Items() {
		super();
	}
	
	public Items(Long idItem, String nombreItem, int cantidad, double valorUnitario) {
		super();
		this.idItem = idItem;
		this.nombreItem = nombreItem;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}

	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	
	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
