package com.adecco.exampleSpringBoot.controller;

import java.util.Random;

import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adecco.exampleSpringBoot.model.Persona;

@org.springframework.stereotype.Controller
public class Controller {

	
	
	@GetMapping("/")
	public ModelAndView getIndex() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index"); // nome della mia
		//pagina html che ho creato in templates
		
		return modelAndView;
	}
	
	
	
	@GetMapping()
	@RequestMapping(value={"/contatti", "/c", "/contact"})
	public ModelAndView getConatti() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("contatti"); // nome della mia
		//pagina html che ho creato in templates
		
		return modelAndView;
	}
	
	
	@GetMapping("/prova")
	public ModelAndView getProva() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("prova");
		
		modelAndView.addObject("myNum", 23);
		modelAndView.addObject("nome", "Rob");
		
		
		return modelAndView;
	}
	
	
	@GetMapping("/genera")
	public ModelAndView generaNumeroRandom() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("generatore");
		
		
		Random random = new Random();
		int num1 = random.nextInt(1, 7); // 1 - 6; 
		int num2 = random.nextInt(1, 7); // 1 - 6; 

							//LABEL   
		modelAndView.addObject("num1", num1);
		modelAndView.addObject("num2", num2);
		
		int valoreFinale = num1 + num2;
		
		if(valoreFinale == 7 )
			modelAndView.addObject("valoreFinale", "hai vinto");
		else
			modelAndView.addObject("valoreFinale", "hai perso");

		
		return modelAndView;
	}
	
	@GetMapping("/gestionale")
	public ModelAndView gestionale() {
		ModelAndView modelAndView =
				new ModelAndView();
		
		modelAndView.setViewName("gestionale");
		
		Persona persona = new Persona("JACK THE RIPP", 60);
		
		
		
		modelAndView.addObject("persona", persona);
		
		
		return modelAndView;
		
	}
	
	
	
	
	
	
	
	
}
