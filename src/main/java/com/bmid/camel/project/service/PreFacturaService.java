package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.PreFactura;

@Service
public class PreFacturaService {

	public static List<PreFactura> preFacturas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		preFacturas.add(new PreFactura(1l,new Date()));

	}
	
	public List<PreFactura> lista(){
		return preFacturas;
	}
	
}
