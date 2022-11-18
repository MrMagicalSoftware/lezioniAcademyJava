package com.adecco.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.adecco.demo2.model.Fox;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		
		//Fetch data
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "https://randomfox.ca/floof/";
		
											// url   come deve essere deserializzato
		Fox risFox = restTemplate.getForObject(url, Fox.class);
		
		
		System.out.println("###########################");
		
		System.out.println(risFox);
		System.out.println("image ---> " + risFox.getImage());
		System.out.println("link ---> " + risFox.getLink());

		System.out.println("###########################");

		//manda il dato alla pagina html con addObject
		modelAndView.addObject("immagineFox", risFox.getImage());
		
		
		
		return modelAndView;
	}
	
	
	
}
