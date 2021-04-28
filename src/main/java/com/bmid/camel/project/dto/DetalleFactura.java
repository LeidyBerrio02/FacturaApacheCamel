package com.bmid.camel.project.dto;

import java.util.List;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFactura {

	private PreFactura preFactura;
	private List<Items> items;
	
	public DetalleFactura() {
		super();
	}
	public DetalleFactura(PreFactura preFactura, List<Items> items) {
		super();
		this.preFactura = preFactura;
		this.items = items;
	}
	public PreFactura getPreFactura() {
		return preFactura;
	}
	public void setPreFactura(PreFactura preFactura) {
		this.preFactura = preFactura;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
	
	
}
