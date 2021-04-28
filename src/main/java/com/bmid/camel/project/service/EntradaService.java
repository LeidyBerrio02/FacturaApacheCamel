package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.Entrada;
import com.bmid.camel.project.dto.Items;
import com.bmid.camel.project.dto.Persona;
import com.bmid.camel.project.dto.PreFactura;
import com.bmid.camel.project.dto.Salida;

@Service
public class EntradaService {

	@Autowired
	public ItemsService itemsService;
	
	@Autowired
	public PersonaService persona;
	
	@Autowired 
	public SalidaService salidaService;
	
	public List<Entrada> listaEntrada = new ArrayList<>();
	//public List<Salida> listSalida = salidaService.listaSalida();
	
	@PostConstruct
	private void init() {
		Entrada entr = new Entrada(
				new Persona("Manuel","Jimenex","52422","100000","Cra 340"),
				(new PreFactura(1l,new Date())), itemsService.lista());
		
		listaEntrada.add(entr);
	}

	public List<Entrada> listaEntrada(){
		return listaEntrada;
		}
	
	public double calcularTotal(Entrada entrada) {
		List<Items> itemsFactura = entrada.getItems();
		double total = 0;
		for (int i = 0; i < itemsFactura.size(); i++) {
			total += itemsFactura.get(i).getValorUnitario()* itemsFactura.get(i).getCantidad();
		}
		return total;
	}

	
	public Salida crearEntrada(Entrada entrada) {
		listaEntrada.add(entrada);
		List<Salida> listSalida = salidaService.listaSalida();
		Salida salida = new Salida(entrada,calcularTotal(entrada),101l);
		listSalida.add(salida);
		return salida;
	}
	
}
