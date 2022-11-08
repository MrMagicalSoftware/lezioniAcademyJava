package lezione10Adecco.magic;

public class Sword {

	private int danno;
	private String tipologia;
	
	public Sword() {
		
	
		setTipologia("spada-fuoco");
		setDanno(); 
		
	}
	
	public Sword(String tipologia) {
		setTipologia(tipologia);
		setDanno();
	}
	
	
	
	
	public void setDanno() {
		
		if(this.tipologia.equals("spadone"))
			this.danno = 200;
		else if(this.tipologia.equals("spada"))
			this.danno = 100;
		else if(this.tipologia.equals("spada-fuoco"))
			this.danno = 350;
		else
			this.danno = 50;
	}
	
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	
	public int getDanno() {
		return danno;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Sword [danno=" + danno + ", tipologia=" + tipologia + "]";
	}
	
	
	
	
	
	
	
	
}
