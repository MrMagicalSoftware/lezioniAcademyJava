package com.adecco.demoExampleDataBase.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.adecco.demoExampleDataBase.service.PersonaService;

import com.adecco.demoExampleDataBase.model.Persona;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	PersonaService personaService;
	
	
	@GetMapping("/api/somma-numeri")
	public int somma(@RequestParam(name="num1") int num1 , 
			@RequestParam(name="num2") int num2 ){
	
		return num1 + num2;
	}
	
	
	
	@GetMapping("/api/getAll")
	public List<Persona> getAllPersone(){
	
		return personaService.getAllPersoneInDatabase();
	}
	
	@GetMapping("/api/destroyByID")
	public boolean deleteById(@RequestParam(name="id") int id) {
		
		return personaService.deletePersonaById(id);
	}
	
	
	
	
	@GetMapping("/api/destroy")
	public boolean deleteAll(@RequestParam(name="codice") int codice) {
		
		if(codice == 1234)
			return personaService.deleteAllPerson();
		
		return false;
	}
	
	
	
	@PostMapping("/api/savePersona")
	public String savePersona(@RequestBody Persona persona) {
		
		
		System.out.println("#####################");
		
		System.out.println("Debug");
		System.out.println(persona);

		System.out.println("#####################");

		
		boolean ris =personaService.addPersona(persona);
		
		if(ris) {
			return "tutto ok bello :) ";
		}
		else {
			return "Sorry qualcosa è andato storto";
		}
		
	}
	
	
	
	
	
	
}
