package lezione11Adecco.eserciziOneToMany;

import java.util.Random;

public class Player {

	private String nome , ruolo;

	
	
	public Player() {
		
		setNome(generaNome());
		setRuolo("difesa");
		
	}
	
	
	
	
	
	
	public Player(String nome, String ruolo) {
		this.nome = nome;
		this.ruolo = ruolo;
	}

	
	
	public String generaNome() {
		
		Random random = new Random();
		
		String[] nomiPossibili =
			{"The WALL" ,"paolo" , "michele" , "giovanni" , "gio", "ciccio" };
		
		
		return nomiPossibili[    random.nextInt(nomiPossibili.length)        ];
	}
	
	
	@Override
	public String toString() {
		return "Player [nome=" + nome + ", ruolo=" + ruolo + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	
	
	
	
	
}
