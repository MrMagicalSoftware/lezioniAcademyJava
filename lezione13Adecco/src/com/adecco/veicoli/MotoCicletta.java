package com.adecco.veicoli;

public class MotoCicletta extends VeicoloAMotore {

	
	
	
	private String tipologia;
	private int  numeroTempiMotore;
	
	
	
	
	
	
	public MotoCicletta() {
		super();
		setTipologia("corsa");
		setNumeroTempiMotore(3);
	}

	public MotoCicletta(int annoImmatricolazione, int cilindrata, String marca, String tipoAlimentazione) {
		super(annoImmatricolazione, cilindrata, marca, tipoAlimentazione);
		setTipologia(tipoAlimentazione);
		setNumeroTempiMotore(numeroTempiMotore);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " tipologia" + tipologia + " " + this.numeroTempiMotore;
	}
	

	public void setNumeroTempiMotore(int numeroTempiMotore) {
		this.numeroTempiMotore = numeroTempiMotore;
	}
	
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	public int getNumeroTempiMotore() {
		return numeroTempiMotore;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	
	
}
