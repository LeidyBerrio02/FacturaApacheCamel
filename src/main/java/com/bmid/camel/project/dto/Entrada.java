package com.bmid.camel.project.dto;

import java.util.List;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Entrada {

	private Persona persona;
	private PreFactura prefactura;
	private List<Items> items;
	
	public Entrada() {
		super();
	}
	
	public Entrada(Persona persona, PreFactura prefactura, List<Items> items) {
		super();
		this.persona = persona;
		this.prefactura = prefactura;
		this.items = items;
	}



	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public PreFactura getPrefactura() {
		return prefactura;
	}
	public void setPrefactura(PreFactura prefactura) {
		this.prefactura = prefactura;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
}
