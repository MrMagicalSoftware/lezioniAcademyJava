package lezione12Adecco.ereditarieta;

public class Lavoratore extends Persona {

	private double salario;
	
	
	
	public Lavoratore(String nome, int eta , double salario) {
		super(nome, eta);
		
		setSalario(salario);
	}
	
	
	

	public Lavoratore() {
		super();
		setSalario(100);
	}
	
	
	
	
	@Override
	public String toString() {
		
		return super.toString() + "salario : " + this.salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
	
	
	
	
	public int fattoriale(int numero) {
		
		if(numero == 1)
			return 1;
		
		return numero * fattoriale(numero - 1 );
	}
	
	
	/**
	 *    fattoriale(5) 
	 *    
	 *    return 5 * fattoriale(4)     5 * 4 * 3 * 2 * 1
	 *    
	 * 
	 * 	  fattoriale(4)
	 * 
	 *    4 * fattoriale(3)     4 * 3 * 2 * 1
	 *    
	 *    
	 *    fattoriale(3)
	 *    
	 * 	  3 * fattoriale(2)        3 * 2 * 1 
	 * 
	 * 
	 *     
	 *    fattoriale(2)
	 * 
	 *    2 * fattoriale(1) ------> 2 * 1
	 * 
	 * 
	 *    fattoriale(1)  ----------> 1
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
