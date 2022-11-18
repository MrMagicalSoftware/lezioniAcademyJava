package com.adecco.apiExample.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.adecco.apiExample.model.Persona;
import com.adecco.apiExample.service.PersonaService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	@Autowired
	private PersonaService personaService;
	
	

	@GetMapping("/api/random")
	public Persona getPersona() {
			
		return personaService.generaPersona();
	}
	
	@GetMapping("/api/getAll")
	public ArrayList<Persona> getAll() {
		

		return personaService.getArrayList();
		
	}
	
	
	@GetMapping("/api/getAllRandom")
	public ArrayList<Persona> getAllRandom() {
		
		return personaService.getArrayList(120);
		
	}
	
	
	
}
