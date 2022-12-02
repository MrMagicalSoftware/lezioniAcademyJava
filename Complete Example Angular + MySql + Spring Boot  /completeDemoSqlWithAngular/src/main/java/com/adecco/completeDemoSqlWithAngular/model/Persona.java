package com.adecco.completeDemoSqlWithAngular.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

*/




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
public class Persona {

	
	
	public Persona(String nome , String cognome , int eta) {
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="eta")
	private int eta;
	
	
	
}
