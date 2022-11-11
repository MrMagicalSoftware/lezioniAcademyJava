package com.adecco.garage;

import java.util.Scanner;

import com.adecco.veicoli.Automobile;
import com.adecco.veicoli.Furgone;
import com.adecco.veicoli.MotoCicletta;

public class MenuGarage {
	
	
	private Garage boxAuto ;
	private Scanner key;
	
	public MenuGarage() {
		boxAuto  = new Garage();
		key = new Scanner(System.in);
	}
	
	public MenuGarage(int posti) {
		boxAuto = new Garage(posti);
		key = new Scanner(System.in);
	}
	
	
	public void stampaMenu() {
		System.out.println("INSERISCI 1 PER INSERIRE");
		System.out.println("INSERISCI 2 PER REMOVE");
		System.out.println("INSERISCI 3 PER STAMPARE");
		System.out.println("INSERISCI ALTRO PER EXIT");
	}
	
	
	public void start() {
		
		boolean isWorking = true;
		
		do {
			
			stampaMenu();

			int input = key.nextInt();
			
			
			switch (input) {
			case 1:
				inserisci();
				break;
			case 2:
				remove();
				break;
			case 3:
				stampa();
				break;	
			default:
				isWorking = false;
				break;
			}
				
		} while (isWorking);
		
		key.close();
	}
	
	
	
	
	public void remove() {
		System.out.println("inserisci la posizione da rim");
		int posizioneDaEliminare = key.nextInt();
		System.out.println("Rimuovo ---------> " +  boxAuto.estraiVeicolo(posizioneDaEliminare));
	}
	
	
	public void stampa() {
		boxAuto.stampaSituazionePosti();
	}
	
	
	public void inserisci() {
		
		System.out.println("ok inserisco ");
		System.out.println("premi 1 per auto");
		System.out.println("premi 2 per furgone");
		System.out.println("premi 3 per moto");
		
		int sceltaUtente = key.nextInt();
		
		
		switch (sceltaUtente) {
		case 1:
			boxAuto.inserisciVeicolo( new Automobile()  );
			break;
		case 2:
			boxAuto.inserisciVeicolo( new Furgone()  );
			break;
		case 3:
			boxAuto.inserisciVeicolo( new MotoCicletta()  );
			break;	
			
		default:
			break;
		}
		
		
	}
	
	
	

	/*
	public static void main(String[] args) {
		
//		Random random = new Random();
//	
//						new Random().nextInt(); // ANONIMO
//		
//						new MainGarage().start();
		
		
		MainGarage mainGarage  = new MainGarage();
		mainGarage.start();
		
		
	}
	 */
	
	
	
}
