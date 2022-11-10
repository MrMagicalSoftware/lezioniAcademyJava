package lezione12Adecco.ereditarieta;

public class Persona {
	
	
	
	private String nome;
	private int eta;
	
	
	public Persona() {
		this("mario", 18);
	}
	
	public Persona(String nome ,int eta ) {
		setNome(nome);
		setEta(eta);
	}
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getEta() {
		return eta;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
	
	public void saluta() {
		System.out.println("ciao come va ???");
		
	}
	
	

}
