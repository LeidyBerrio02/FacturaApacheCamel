package com.bmid.camel.project.components;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bmid.camel.project.dto.Entrada;
import com.bmid.camel.project.dto.Salida;
import com.bmid.camel.project.service.EntradaService;
import com.bmid.camel.project.service.SalidaService;

@Component
public class EntradaProcesor implements Processor{

	@Autowired
	public EntradaService entradaService;
	
	@Autowired
	public SalidaService salidaService;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		//entradaService.crearEntrada(exchange.getIn().getBody(Entrada.class));
		Salida salida = entradaService.crearEntrada(exchange.getIn().getBody(Entrada.class));
		exchange.getIn().setBody(salida);
	}

	
}
