package lezione12Adecco;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		Scaffale scaffale = new Scaffale(7);
		
		
		/*
		scaffale.aggiungiBevanda(  new Bevanda("cola", 0.33, 1, false)  );
		scaffale.aggiungiBevanda(  new Bevanda("cola", 0.33, 1, false)  );
		scaffale.aggiungiBevanda(  new Bevanda("cola", 0.33, 1, false)  );
		scaffale.aggiungiBevanda(  new Bevanda("cola", 0.33, 1, false)  );
		scaffale.aggiungiBevanda(  new Bevanda("fanta", 0.33, 3, false)  );
		scaffale.aggiungiBevanda(  new Bevanda("birra", 0.66, 4.5, true)  );

		
		scaffale.stampaBevande();
		
		
		System.out.println();
		
		System.out.println("Somma totale " + scaffale.sommaScaffale());
		System.out.println("Somma totale cola " + scaffale.sommaScaffale("cola")   );
		System.out.println("Somma totale fanta " + scaffale.sommaScaffale("fanta")  );

		*/
		
		Scanner key = new Scanner(System.in);
		
		boolean isWorking = true;
		
		do {
			
			System.out.println("Cosa vuoi fare?");
			System.out.println("Premi 1 per inserire");
			System.out.println("Premi 2 per eliminare");
			System.out.println("Premi 3 per stampare");
			System.out.println("Premi 4 riempire tutto");
			System.out.println("Premi 5 o altro per uscire");

			
			int sceltaUtente = key.nextInt();
			
			
			switch (sceltaUtente) {
			case 1:
				
				if (scaffale.aggiungiBevanda(new Bevanda()  )  ) 
					System.out.println("ok ho aggiunto una bevanda");
				else 
					System.out.println("posti finiti");


				break;
			
			case 2:
				
				System.out.println("inserisci la pos da eliminare");
				int posDaEliminare = key.nextInt();
				Bevanda bev =  scaffale.rimuoviBevanda(posDaEliminare);
				
				if(bev == null)
					System.out.println("non ho rimosso nulla");
				else
					System.out.println("ok ti servo  ... ... . " +bev);

					
				break;
			
			case 3:
				scaffale.stampaBevande();
				break;
				
			case 4:
				scaffale.fillAll();
				break;	
				

			default:
				System.out.println("ok esco");
				isWorking = false;
				break;
			}
			
			
			System.out.println("\n\n");
			
			
		} while (isWorking);
		
		
		
		
		
		
		
		key.close();
	}
	
}
