package lezione11Adecco.eserciziOneToMany;

public class Starter {

	public static void main(String[] args) {
		
		Team team = new Team();
		
		team.stampaTeam();

		
		
		int i = 0;
		
		while(i < 10 ) {
			
			if(team.addPlayer(new Player())) {
				System.out.println("ok ho inserito un player");
			}
			else
				System.out.println("nessun posto disponibile");
				
			i++;
		}
		
	
		System.out.println("#########################");
		
		team.stampaTeam();
		
		
		System.out.println( "rimosso --->" + team.removeRandomPlayer()      );

		System.out.println("#########################");

		team.stampaTeam();
		
		System.out.println("#########################");


		System.out.println( "rimosso --->" + team.removePlayer()      );

		team.stampaTeam();

		
	}

}
