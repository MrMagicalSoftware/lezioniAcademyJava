package com.adecco.exampleSpringBoot.model;

public class Persona {

	private String nome;
	private int eta;
	
	public Persona() {
		this("mario" , 33);
	}
	
	public Persona(String nome, int eta) {
		setEta(eta);
		setNome(nome);
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}

	public int getEta() {
		return eta;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
}
