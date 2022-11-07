package lezione9Adecco;

import java.util.Scanner;

public class StartBluRay {

	public static void main(String[] args) {

		
	//	BluRay bluRay1 = new BluRay();
		//invocare tutti i set
//		bluRay1.setDurata(100);
//		bluRay1.setGenere("AVVENTURA");
//		bluRay1.setRatedForAnyOne(true);
//		bluRay1.setTitolo("HARRY POTTER");
		
		
		
		/*
		BluRay bluRay = new BluRay();
		System.out.println(bluRay.getGenere());
		
		
		
		BluRay bluRay2 = new BluRay("FAST AND FU", -150, "CORSE AUTO", false);
		
		System.out.println(bluRay2  );
		System.out.println(bluRay2.toString()  );
		
		
		System.out.println("#################################");
		
		BluRay bluRayHP2 = new BluRay();
		bluRayHP2.setTitolo("hp2 ");
		
		System.out.println(bluRayHP2);
		
		System.out.println(bluRayHP2.getDurata() + bluRayHP2.getTitolo() );
		
		*/
		
		
		Scanner key = new Scanner(System.in);

		
		System.out.println("titolo");
		String titolo = key.next();
		
		
		System.out.println("INSERISCI UN GENERE");
		String genere = key.next();
		
		System.out.println("INSERISCI durata");
		double durata = key.nextDouble();
		
		System.out.println("is for family ?");
		boolean isForF = key.nextBoolean();

		
		BluRay bluRay = new BluRay(titolo, durata, genere, isForF);
		
		System.out.println(bluRay);
		System.out.println(bluRay.toString());

		
		
		key.close();
	}

}
