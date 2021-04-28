package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.*;

@Service
public class SalidaService {
	
	@Autowired
	public ItemsService itemsService;

	public static List<Salida> listSalida = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		Entrada entrada = new Entrada(new Persona("Manuel","Jimenex","52422","100000","Cra 340"), ( new PreFactura(1l,new Date())), itemsService.lista());
		Salida salida = new Salida(entrada,calcularTotal(),100l);
		listSalida.add(salida);
		
	}
	
	public double calcularTotal() {
		List<Items> itemsFactura = itemsService.lista();
		double total = 0;
		for (int i = 0; i < itemsFactura.size(); i++) {
			total += itemsFactura.get(i).getValorUnitario()* itemsFactura.get(i).getCantidad();
		}
		return total;
	}

	
	public List<Salida> listaSalida(){
		return listSalida;
	}
	
	}

