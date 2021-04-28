package com.bmid.camel.project.components;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bmid.camel.project.dto.Persona;
import com.bmid.camel.project.service.PersonaService;

@Component
public class PersonaProcesor implements Processor {

	@Autowired
	public PersonaService personaService;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		personaService.crearPersona(exchange.getIn().getBody(Persona.class));
		
	}

}
