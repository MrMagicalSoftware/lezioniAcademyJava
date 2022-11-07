package lezione9Adecco;

public class BluRay {

	
	/**
	 * 
	 *   titolo String
	 *   durata double
	 *   boolean isRaitedForAnyOne 
	 *   String genere
	 * 
	 * 
	 */
	
	private String titolo;
	private double  durata;
	private boolean isRatedForAnyOne;
	private String genere;
	
	
	
	//costruttore di default
	public BluRay() {
		setDurata(100);
		setGenere("AVVENTURA");
		setTitolo("Harry potter");
		setRatedForAnyOne(true);
	}
	
	
	public BluRay(String titolo, double durata,String genere,
			boolean isRatedForAnyOne) {
		
		setDurata(durata);	///this.durata = durata;
		setTitolo(titolo);
		setRatedForAnyOne(isRatedForAnyOne);
		setGenere(genere);
		
	}
	
	
	public String toString() {
		
		String filmPertuttiString = isRatedForAnyOne ? "film x tutti" : "no film x minori";
		
		return "NOME FILM " + titolo + " DURATA   " + durata +
				"genere " + genere + " " + filmPertuttiString;
	}
	
	
	
	public String getTitolo() {
		return titolo;
	}
	public double getDurata() {
		return durata;
	}
	public boolean isRatedForAnyOne() {
		return isRatedForAnyOne;
	}
	public String getGenere() {
		return genere;
	}
	
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	public void setDurata(double durata) {
		this.durata = durata > 0 ? durata : - durata;
	}
	
	public void setRatedForAnyOne(boolean isRatedForAnyOne) {
		this.isRatedForAnyOne = isRatedForAnyOne;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	

	
	
	
	
	
	
	

	
	
}
