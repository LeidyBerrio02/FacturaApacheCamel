package com.bmid.camel.project.routers;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.bmid.camel.project.components.EntradaProcesor;
import com.bmid.camel.project.components.PersonaProcesor;
import com.bmid.camel.project.dto.Entrada;
import com.bmid.camel.project.dto.Persona;
import com.bmid.camel.project.dto.Salida;
import com.bmid.camel.project.service.EntradaService;
import com.bmid.camel.project.service.FacturaService;
import com.bmid.camel.project.service.ItemsService;
import com.bmid.camel.project.service.PersonaService;
import com.bmid.camel.project.service.SalidaService;

@Component
public class SesionRouter extends RouteBuilder {

	@Autowired
	private PersonaService personaService;
	
	@Autowired
	private FacturaService facturaService;
	
	@Autowired
	private ItemsService itemService;
	
	@Autowired
	private EntradaService entradaService;
	
	@Autowired
	private EntradaProcesor entradaProcesor;
	
	@Autowired
	private PersonaProcesor personaProcesor;

	@Autowired
	private SalidaService salidaService;
	
	@Override
	public void configure() throws Exception {
		
		restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		
		
		rest()
		.get("/Persona")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.route()
		.setBody()
		.constant(personaService.listaPersonas());
		
		rest("/Persona")
		.post("/crear")
		.consumes(MediaType.APPLICATION_NDJSON_VALUE)
		.type(Persona.class)
		.outType(Persona.class)
		.route()
		.process(personaProcesor)
		.endRest();
		
		rest()
		.get("/Entrada")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.route()
		.setBody()
		.constant(entradaService.listaEntrada());
		
		rest("/Entrada")
		.post("/crear")
		.consumes(MediaType.APPLICATION_NDJSON_VALUE)
		.type(Entrada.class)
		.outType(Salida.class)
		.route()
		.process(entradaProcesor)
		.endRest();
		
		rest()
		.get("/Factura")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.route()
		.setBody()
		.constant(facturaService.listaFactura());
		
		rest()
		.get("/Items")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.route()
		.setBody()
		.constant(itemService.lista());
		
		
		rest()
		.get("/Salida")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.route()
		.setBody()
		.constant(salidaService.listaSalida());
		
	}
	
	
}
