package com.adecco.completeDemoSqlWithAngular.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adecco.completeDemoSqlWithAngular.model.Persona;
import com.adecco.completeDemoSqlWithAngular.service.PersonaService;


@CrossOrigin(origins = "*")
@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	@Autowired
	PersonaService personaService;
	
	
	@GetMapping("/all")
	public List<Persona> getAll(){
		return personaService.getPersone();
	}
	
	
	
	@DeleteMapping("/delete")
	public boolean deleteById(@RequestParam int id) {
		
		return personaService.removeById(id);
	}
	
	
	@PostMapping("/insert")
	public boolean inserisciPersona(@RequestBody Persona persona) {
		
		System.out.println("here");
		
		try {
			System.out.println("Sono qui " + persona);
			
			return personaService.addPersona(persona);
			
		
		}catch (Exception e) {
			System.out.println("ERRORE " + e);
			return false;
		}
		
	
	
	}
	
	
	
	
	
	
	
	
}
