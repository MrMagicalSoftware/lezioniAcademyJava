package com.adecco.demoExampleDataBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adecco.demoExampleDataBase.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

	
	
}
