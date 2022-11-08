package lezione10Adecco.magic;

import java.util.Random;

public class TestMago {

	public static void main(String[] args) throws InterruptedException {
	
		
		Random random = new Random(); 
		
		Sword spadaSword = new Sword("spadone");
		Mago mago = new Mago("GANDALF", 300, spadaSword);
		
		int i = 0 ;
		
		
		while(i < 20) {
			
			int tipologiaAttacco = random.nextInt(1, 4); // 1 -3
			
			
			Thread.sleep(1000);
			
			
			switch (tipologiaAttacco) {
			case 1:
				
				System.out.println("attacco con la spada");
				System.out.println(mago.dannoSpada());
				
				
				break;
			case 2:
				
				System.out.println("folata magica");
				System.out.println(mago.folataMagica());
				
				break;
			
			case 3:
				
				System.out.println("raggio");
				System.out.println(mago.raggioVerde());
				
				break;
				

			default:
				break;
			}
			
			
			i++;
		}
		
		
		
		

	}

}
