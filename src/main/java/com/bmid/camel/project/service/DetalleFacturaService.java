package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.DetalleFactura;
import com.bmid.camel.project.dto.PreFactura;

@Service
public class DetalleFacturaService {

	@Autowired
	public ItemsService itemsService;
	
	public static List<DetalleFactura> detalles = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		detalles.add(new DetalleFactura(new PreFactura(1l,new Date()), itemsService.lista()));	
	}
	
	public List<DetalleFactura> listaDetalle(){
		return detalles;
	}
	
	
	
}
