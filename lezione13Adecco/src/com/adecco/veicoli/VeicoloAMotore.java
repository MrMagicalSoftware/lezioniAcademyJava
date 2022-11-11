package com.adecco.veicoli;

public class VeicoloAMotore {

	private int annoImmatricolazione , cilindrata;
	private String marca, tipoAlimentazione;
	
	
	
	public VeicoloAMotore() {
		this(2010, 1500, "Suburu", "benzina");
	}
	
	
	

	public VeicoloAMotore(int annoImmatricolazione, 
			int cilindrata, String marca, String tipoAlimentazione) {
	
		
		setAnnoImmatricolazione(annoImmatricolazione);
		setCilindrata(cilindrata);
		setMarca(marca);
		setTipoAlimentazione(tipoAlimentazione);
	}



	@Override
	public String toString() {
		return "VeicoloAMotore [annoImmatricolazione=" + annoImmatricolazione + ", cilindrata=" + cilindrata
				+ ", marca=" + marca + ", tipoAlimentazione=" + tipoAlimentazione + "]";
	}
	
	
	
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public String getMarca() {
		return marca;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * 
	 * tipo di alimenazione :
	 * benzina diesel e-tron , gpl , metano
	 * 
	 * @param tipoAlimentazione
	 */
	public void setTipoAlimentazione(String tipoAlimentazione) {
		
		
		switch (tipoAlimentazione) {
		case "benzina":
			this.tipoAlimentazione = "benzina";
			break;

		case "diesel":
			this.tipoAlimentazione = "diesel";
			break;
		
		case "e-tron":
			this.tipoAlimentazione = "e-tron";
			break;
			
		case "gpl":
			this.tipoAlimentazione = "gpl";
			break;
			
		case "metano":
			this.tipoAlimentazione = "metano";
			break;
			
		default:
			this.tipoAlimentazione = "benzina";
			break;
		}
		
	}
	
	
	
	
	
	
}
