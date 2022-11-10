package lezione12Adecco.ereditarieta;

public class Studente extends Persona {

	
	private String corsoDiStudio;
	
	
	public Studente() {
		
		super(); // significare chiamare il costruttore
				// default della classe Persona
		setCorsoDiStudio(corsoDiStudio);
		
	
	}
	
	//String nome ,int eta , String corsoDiStudio
	
	public Studente(String nome ,int eta , String corsoDiStudio) {
		super(nome, eta);
		setCorsoDiStudio(corsoDiStudio);
	}
	
	
	
	
	@Override
	public String toString() {
		
		return super.toString() + "corso di studio :" + corsoDiStudio ; 
	}
	
	
	public void festeggiaEsamePassato() {
		System.out.println("wowwwwwwwwwwwwww !!!!");
	}
	
	
	public String getCorsoDiStudio() {
		return corsoDiStudio;
	}
	
	public void setCorsoDiStudio(String corsoDiStudio) {
		this.corsoDiStudio = corsoDiStudio;
	}
	
	
	
}
