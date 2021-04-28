package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.DetalleFactura;
import com.bmid.camel.project.dto.Factura;
import com.bmid.camel.project.dto.Items;
import com.bmid.camel.project.dto.Persona;
import com.bmid.camel.project.dto.PreFactura;

@Service
public class FacturaService {
	
	@Autowired
	public ItemsService itemsService;

	public static List<Factura> factura = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		
		Factura fact = new Factura (
				new Persona("Carolina","Jimenex","52422","100000","Cra 340"),
				new  DetalleFactura(new PreFactura(1l,new Date()), itemsService.lista())
				,calcularTotal(),1000l);
		factura.add(fact);
	
	}
	
	public double calcularTotal() {
		List<Items> itemsFactura = itemsService.lista();
		double total = 0;
		for (int i = 0; i < itemsFactura.size(); i++) {
			total += itemsFactura.get(i).getValorUnitario()* itemsFactura.get(i).getCantidad();
		}
		return total;
	}
	
	public List<Factura> listaFactura(){
	return factura;
	}
}
