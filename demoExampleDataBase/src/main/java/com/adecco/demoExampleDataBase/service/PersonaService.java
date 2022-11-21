package com.adecco.demoExampleDataBase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adecco.demoExampleDataBase.model.Persona;
import com.adecco.demoExampleDataBase.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	
	
	
	public boolean addPersona(Persona persona) {
		
		
		if(persona == null || persona.getEta() < 18)
			return false;
		
		personaRepository.save(persona);
		return true;
	}
	
	
	
	
	public boolean deleteAllPerson() {
		
		personaRepository.deleteAll();
		return true;
	}
	
	
	
	public List<Persona> getAllPersoneInDatabase(){
	
		return personaRepository.findAll();
	}
	
	
	public boolean deletePersonaById(int id) {
		
		if(personaRepository.existsById(id)) {
			personaRepository.deleteById(id);
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	
	
}
