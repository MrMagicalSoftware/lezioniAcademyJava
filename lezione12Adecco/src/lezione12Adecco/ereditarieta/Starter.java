package lezione12Adecco.ereditarieta;

public class Starter {

	public static void main(String[] args) {
		
		
		//polimorfismo
		
		
		Persona[] persone = new Persona[5];
		
		
		persone[0] = new Studente("gigi", 22, "medicina");
		persone[1] = new Lavoratore();
		persone[2] = new Lavoratore("ciccio", 70, 500);
		persone[3] = new Studente();
		persone[4] = new Persona("MARIO", 64);

		
		
//		for (int i = 0; i < persone.length; i++) {
//			System.out.println(persone[i].toString());
//		}
		
		
		for (int i = 0; i < persone.length; i++) {
			
			
			if(persone[i] instanceof Studente) {
				//trasformazione della persona in studente
				// casting -------->    
				//   Sintassi          (   (NomeClasse) nomeObj    ).metodoDellaClasse();
				( (Studente) persone[i] ).festeggiaEsamePassato();
				
			}
			
		}
		
		
		System.out.println("Esempi di instanceof");
		
		
		Persona p1 = new Persona();
		Persona p2 = new Studente();
		Persona p3 = new Lavoratore();
		
		System.out.println(p1 instanceof Persona);
		System.out.println(p1 instanceof Studente);
		System.out.println(p1 instanceof Lavoratore);

		System.out.println("########################");
		System.out.println("p2");
	
		System.out.println(p2 instanceof Persona);  // t
		System.out.println(p2 instanceof Studente); // t 
		System.out.println(p2 instanceof Lavoratore); // f
		
		
		System.out.println("########################");
		System.out.println("p3");
		
		
		System.out.println(p3 instanceof Persona);  // t
		System.out.println(p3 instanceof Studente); // f 
		System.out.println(p3 instanceof Lavoratore); // t
		
		
		String risString ="ciao";
		
		System.out.println(risString instanceof String);
		
		
//		Lavoratore l1 = new Persona();
//		Persona persona1 = new Lavoratore();
		
		
		
	}

}
