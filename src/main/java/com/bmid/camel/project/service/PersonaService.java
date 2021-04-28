package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.Persona;

@Service
public class PersonaService {
	
	@Autowired
	public DetalleFacturaService detalleFacturaService;
	
	
	public static List<Persona> personas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		personas.add(new Persona("Manuel","Jimenex","52422","100000","Cra 340"));
	}
	
	public List<Persona> listaPersonas(){
		return personas;
	}
	
	public Persona crearPersona(Persona persona) {
		 personas.add(persona);
		 return persona;
	}

}
