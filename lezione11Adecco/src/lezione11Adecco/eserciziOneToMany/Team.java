package lezione11Adecco.eserciziOneToMany;

import java.util.Random;

public class Team {

	private String nome;
	private Player[] players;
	

	public Team() {
		setNome("Red team");
		this.players = new Player[5];
	}
	
	
	
	
	public Player removeRandomPlayer() {
		
		Random random = new Random();
		
		int indice = random.nextInt(players.length); // 0 -- n-1
		
		Player tmpPlayer = players[indice];
		
		players[indice] = null;
		
		return tmpPlayer;	
	}
	
	
	

	public Player removePlayer() {
		
		for(int i = 0 ; i < this.players.length;i++) {
			
			if(this.players[i] != null) {
				
				Player tmpPlayer = this.players[i]; //salvo
				this.players[i] = null;
				
				return tmpPlayer;
			}
			
		}
		
		return null;	
	}
	
	
	public boolean addPlayer(Player player) {
		
		if(player == null)
			return false;
		
		
		for(int i = 0 ; i < this.players.length ;i++) {
			
						
			if(this.players[i] == null) {	
				this.players[i] = player;
				return true;
			}
		}
		
		
		return false;
		
	}
	
	
	
	public int contaPostiLiberi() {
		
		int postiLiberi = 0;
		
		
		//		for(Player p : this.players) {
		//			if(p == null)
		//				postiLiberi++;
		//		}
		
		for(int i = 0; i < this.players.length ;i++) 
			if(this.players[i] == null)
				postiLiberi++;
			
		return postiLiberi;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	
	
	public void stampaTeam() {
		
		for(Player p : this.players) {
			System.out.println(p);
		}
		
	}
	
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
