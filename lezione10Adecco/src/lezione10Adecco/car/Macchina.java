package lezione10Adecco.car;

import java.util.Random;

public class Macchina {

	
	private String targa;
	private int cilindrata;
	
	
	
	public Macchina() {
		setTarga(   generaTarga()  );
		setCilindrata(1550);
	}
	
	
	public Macchina(String targa, int cilindrata) {
		setTarga(targa);
		setCilindrata(cilindrata);
	}

	
	
	public String generaTarga() {
		
		Random random = new Random();
		String[] alphaStrings = { "a" , "b" , "c" , "d" ,"e" ,"1" ,"2"};
		String ris ="";
		
		for(int i = 0 ; i < 10 ; i++) {
			ris += alphaStrings[  random.nextInt(alphaStrings.length)   ];
		}
		// bae1a .....
		return ris;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Macchina [targa=" + targa + ", cilindrata=" + cilindrata + "]";
	}

	public String getTarga() {
		return targa;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
	
	
	
	
	
	
}
