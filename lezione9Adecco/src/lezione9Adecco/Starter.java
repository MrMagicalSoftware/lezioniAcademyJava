package lezione9Adecco;

public class Starter {

	public static void main(String[] args) {
	
		
		
		Persona persona = new Persona();
		
		System.out.println("#######################");
		System.out.println("Nome : " + persona.getNome() );
		System.out.println("Eta " + persona.getEta());
		
		System.out.println("######################");
		
		persona.setNome("mario");
		int eta = 18;
		persona.setEta(eta);
		
		
		System.out.println("Nome : " + persona.getNome() );
		System.out.println("Eta " + persona.getEta());
		
		System.out.println();
		
		persona.setEta(    persona.getEta() + 1             );
		
		
		System.out.println("nuova -----> " + persona.getEta() );
		
	}

}
