package lezione10Adecco.magic;

import java.util.Random;

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
	
	
	// AZIONI -------------------
	
	

	/**
	 * 
	 * Danno compreso tra 20-50
	 * 
	 * @return
	 */
	public int folataMagica() {
		
		Random random = new Random();
		
		return random.nextInt(20, 51);
	}
	
	
	
	/**
	 * 
	 * 	30 % non toglie danno
	 *  40 % danno compreso tra 20 - 50
	 *  30 % colpo critico ---  20 - 150 
	 * 
	 * @return
	 */
	public int raggioVerde() {
		
		Random random = new Random();
		int sceltaDanno = random.nextInt(1, 11); // 1 -10
		
		if(sceltaDanno <= 3)
			return 0 ;
		
		// 4 5 6 7
		if(sceltaDanno > 3 && sceltaDanno <= 7)
			return random.nextInt(20, 51);
		
		
		return random.nextInt(20, 151);
		
	}
	
	
	public int dannoSpada() {
		
		Random random = new Random();
		
		int scelta = random.nextInt(0,101);
		int dannoExtra = random.nextInt(0,11);		
		
		//perdo la spada 3 % 
		if(scelta >= 98) {
			this.spada.rompiArma();
		}
	
		if(this.spada.getTipologia().equalsIgnoreCase("spadone")) {
			dannoExtra += 10;
		}
					
		int dannoFinale = this.spada.getDanno() + dannoExtra;
	
		return dannoFinale;
	}
	
	
	
	
	
	

}
