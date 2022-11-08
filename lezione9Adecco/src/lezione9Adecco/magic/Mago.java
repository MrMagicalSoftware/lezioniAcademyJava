package lezione10Adecco.magic;


/***
 * 
 * 
 * 
 * 	String nome
 * 	int puntiVita
 *  boolean isAlive
 *  
 *  nel setpUNTIVITA --->
 *  
 *  SE I PUNTI VITA SONO INFERIORI O UGUALI A 0
 *  isAlive vale false.
 * 
 * 
 * 
 * 
 * @author mr
 *
 */

public class Mago {
	
	
	private String nome;
	private int puntiVita;
	private boolean isAlive;
	
	private Sword spada;
	
	
	public Mago() {
		setNome("GG MAGO");
		setPuntiVita(100);
		setAlive(true);		
		setSpada(   new Sword());
	}
	
	public Mago(String nome , int puntiVita , Sword sword) {
		setNome(nome);
		setAlive(true);
		setPuntiVita(puntiVita);
		setSpada(sword);
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		String statoSalute = isAlive ? "vivo" : "morto";
		
		return "Mago [nome=" + nome + ", puntiVita=" 
				+ puntiVita + statoSalute + ", spada=" + spada + "Danno spada " + spada.getDanno() +"]" ;
	}

	public Sword getSpada() {
		return spada;
	}
	
	public void setSpada(Sword spada) {
		
		if(spada != null)
			this.spada = spada;
		else
			this.spada = new Sword();

	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
		
		if(this.puntiVita <= 0)
			this.isAlive = false;
		
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	public int getPuntiVita() {
		return puntiVita;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	

}
