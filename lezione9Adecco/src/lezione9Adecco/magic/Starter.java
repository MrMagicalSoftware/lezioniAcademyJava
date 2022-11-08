package lezione10Adecco.magic;

public class Starter {

	public static void main(String[] args) {
		

//		Sword spadaFuoco = new Sword();
//		
//		System.out.println(spadaFuoco);
//		
//	
//		
//		Sword spada2 = new Sword("spadone");
//		System.out.println(spada2);
//
//		
//		
//		Sword spada3 = new Sword("bastone in legno");
//		System.out.println(spada3);
		
		
		Mago mago = new Mago();
		System.out.println(mago);
		
		Sword spada = new Sword("spadone");
		Mago mago2 = new Mago("SARUMAN", 400, spada);
		
		
		System.out.println(mago2);
		
		
	}

}
