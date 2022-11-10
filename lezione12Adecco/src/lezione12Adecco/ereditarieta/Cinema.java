package lezione12Adecco.ereditarieta;

public class Cinema {
	
	private Persona[] personeAlCinema;
	
	public Cinema() {
		
		this.personeAlCinema = new Persona[5];
	}

	
	
	public void stampaCinema() {
		
		for(Persona persona : this.personeAlCinema)
			System.out.println(persona);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}