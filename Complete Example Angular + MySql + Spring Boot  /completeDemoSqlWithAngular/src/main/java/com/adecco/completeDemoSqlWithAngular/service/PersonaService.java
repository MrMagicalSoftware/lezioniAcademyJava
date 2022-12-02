package com.adecco.completeDemoSqlWithAngular.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adecco.completeDemoSqlWithAngular.model.Persona;
import com.adecco.completeDemoSqlWithAngular.repository.PersonaRepository;

@Service
public class PersonaService {

	
	@Autowired
	PersonaRepository personaRepository;
	
	
	
	public boolean removeById(int id) {
		
		try {
			personaRepository.deleteById(id);
			
			return true;
		}catch (Exception e) {
			return false;
		}
		
		
	}
	
	
	public boolean addPersona(Persona persona) {
		
		if(persona == null)
			return false;
		
		personaRepository.save(persona);
		
		return true;
	}
	
	
	public List<Persona> getPersone(){
		
		return personaRepository.findAll();
	}
	
	
	
	
}
