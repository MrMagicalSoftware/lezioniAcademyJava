package lezione12Adecco;

public class Scaffale {

	private Bevanda[] bevande;
	
	public Scaffale(int dimensione) {
		this.bevande = new Bevanda[dimensione];
	}
	
	
	public Scaffale() {
		this.bevande = new Bevanda[20];
	}
	
	
	public void stampaBevande() {
		
		int i = 0 ;
		for(Bevanda b : this.bevande) {
			System.out.println(i + " " +b);
			i++;
		}
	}
	
	
	public double sommaScaffale() {
		
		double sommaTotale = 0;
		
		for(Bevanda b : this.bevande) {
			if(b  != null) {
				sommaTotale += b.getCosto();
			}
		}
		
		
//		for(int i = 0 ; i < this.bevande.length ;i++ ) {
//			if(this.bevande[i]  != null) {
//				sommaTotale += this.bevande[i].getCosto();
//			}
//		}
		
		
		
		return sommaTotale;
	}
	
	
	
	
	public double sommaScaffale(String nomeBevanda) {
		
		
		double sommaTotale = 0;
		
		for(Bevanda b : this.bevande) {
			if(b  != null) {
				
				if(b.getNome().equalsIgnoreCase(nomeBevanda))
					sommaTotale += b.getCosto();
			}
		}
		
		return sommaTotale;
	}
	
	/**
	 * 
	 * Questa funzione prende
	 * in input una bevanda e
	 * cerca nel vettore delle bevande
	 * se esiste un posto libero.
	 * 
	 * se esiste lo riempie  e ritorna true
	 * altrimenti false.
	 * 
	 * 
	 * @param bevanda
	 * @return
	 */
	public boolean aggiungiBevanda(Bevanda bevanda) {
		
		if(bevanda == null)
			return false;
		
		for (int i = 0; i < bevande.length; i++) {
			//cerca un posto nello scaffale libero
			if(this.bevande[i] == null) {
				this.bevande[i] = bevanda;
				return true;	
			}
		}
		
		return false;
	}
	
	
	
	public Bevanda rimuoviBevanda(int posizione) {
		
		if(posizione >= this.bevande.length || posizione < 0)
			return null;
		
		Bevanda tmpBevanda = this.bevande[posizione] ;
		this.bevande[posizione] = null; //cancella
		
		return tmpBevanda;
	}
	
	
	public void fillAll() {
		
		for (int i = 0; i < bevande.length; i++) {
			if(bevande[i] == null)
				bevande[i] = new Bevanda(); 
		}
		
		
	}
	
	
	
	
	
	
	/**
	 * 
	 * Principio di overloading
	 * 
	 * 
	 * 	public void ciao() {
		
	}
	
	
	public void ciao(String s1 , String s2) {
		
	}
	
	
	public String ciao(String s) {
		
		return "";
	}
	 * 
	 * 
	 * 
	 * 
	 */

	
	
	
	
	
	
}
