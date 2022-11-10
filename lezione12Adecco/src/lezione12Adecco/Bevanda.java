package lezione12Adecco;

public class Bevanda {

	
	
	private String nome;
	private double capienza, costo;
	private boolean isAlcoholic;
	
	public Bevanda() {
		this("fanta", 0.33, 1, false);
	}

	
	
	
	public Bevanda(String nome, 
			double capienza, 
			double costo, boolean isAlcoholic) {
		
		setNome(nome);
		setCapienza(capienza);
		setCosto(costo);
		setAlcoholic(isAlcoholic);
		
	}

	
	
	

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", capienza=" 
				+ capienza + ", costo=" 
				+ costo + ", isAlcoholic=" + isAlcoholic
				+ "]";
	}




	public String getNome() {
		return nome;
	}


	public double getCapienza() {
		return capienza;
	}


	public double getCosto() {
		return costo;
	}


	public boolean isAlcoholic() {
		return isAlcoholic;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setCapienza(double capienza) {
		this.capienza = capienza;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
