package lezione10Adecco.car;

public class Persona {

	private String nome;
	private int eta;
	private Macchina car; 
	
	
	public Persona() {
		setNome("mario");
		setEta(18);
		setCar(  new Macchina()  );
	}
	
	public Persona(String nome , int eta , Macchina car) {
		
		setNome(nome);
		setEta(eta);
		setCar( car );
	}
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", car=" + car + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getEta() {
		return eta;
	}
	public Macchina getCar() {
		return car;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public void setCar(Macchina car) {
		this.car = car;
	}
	
	
	
	
	
}
