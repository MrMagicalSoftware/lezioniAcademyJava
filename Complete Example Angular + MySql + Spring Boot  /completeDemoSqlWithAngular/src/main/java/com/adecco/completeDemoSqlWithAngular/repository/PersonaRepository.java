package com.adecco.completeDemoSqlWithAngular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adecco.completeDemoSqlWithAngular.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
