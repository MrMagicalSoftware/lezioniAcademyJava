package com.adecco.apiExample.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Service;

import com.adecco.apiExample.model.Persona;

@Service
public class PersonaService {

	public Persona generaPersona() {
		
		Random random = new Random();
		
		ArrayList<String> nomiDisponibili =
				new ArrayList<>();
		
		nomiDisponibili.add("paolo");
		nomiDisponibili.add("andrea");
		nomiDisponibili.add("michele");
		nomiDisponibili.add("math");
		nomiDisponibili.add("rob");
		nomiDisponibili.add("ciro");
		nomiDisponibili.add("ciccio");
		nomiDisponibili.add("lucone");
		
		String nome = nomiDisponibili.get(random.nextInt(nomiDisponibili.size()));
		int eta = random.nextInt(0 , 100);
		
		Persona persona = new Persona(nome, eta);
		
		return persona;
	}
	
	
	public ArrayList<Persona> getArrayList(){
		
		ArrayList<Persona> persone = new ArrayList<>();
		persone.add(new Persona("Dave" , 51));
		persone.add(new Persona("Jack" , 22));
		persone.add(new Persona("Ciro" , 33));
		persone.add(new Persona("Math" , 66));
		
		
		return persone;
	}
	
	
	public ArrayList<Persona> getArrayList(int elementi){
		
		ArrayList<Persona> persone = new ArrayList<>();
		
		for(int i = 0 ; i < elementi ; i++) {
			persone.add(generaPersona());
		}
		
		
		return persone;
	}
	
	
	
	
	
	
}
