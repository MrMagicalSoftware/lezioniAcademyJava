package lezione9Adecco;

public class Persona {
	
	
	private String nome;
	private int eta;
	
	
	
//	public String getNome() {
//		return nome;
//	}
//	
	
	
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	
	public void setNome(String nuovoNome) {
		
		if(nuovoNome.length() < 3)
			nome ="default name";
		else
			nome = nuovoNome;
	}
	
	
	public void setEta(int nuovaEta) {
		
		eta = nuovaEta > 0 ? nuovaEta : - nuovaEta;
		
		
	}
	
	
	
	
	
	
	
	public void salutami() {
		System.out.println("ciao mi chiamo " + nome + " eta " + eta);
	}
	
	

}
