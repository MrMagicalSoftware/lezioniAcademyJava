package lezione10Adecco.car;

public class TestMacchina {

	public static void main(String[] args) {
		
		
		Macchina car = new Macchina();
		
		Persona persona1 = new Persona("gigi", 20, car);
		
		Persona persona2 = new Persona("gigi", 20, new Macchina());
		Persona persona3 = new Persona("gigi", 20, new Macchina("MI-23321", 1550));

		
		
		
		
		
		
		/*
		
		Macchina[] insiemeDiAuto = new Macchina[10];
		
		for (int i = 0; i < insiemeDiAuto.length; i++) {
			insiemeDiAuto[i] = new Macchina();
		}
		
		
		
		for (Macchina macchina : insiemeDiAuto) {
			System.out.println( macchina);	
		}
		
		
		
		
		//esempio di foreach
		
		int[] vettInt = { 10 , 20 , 30 };
		
		
		for(int i : vettInt)
			System.out.println(i);
		
		
		//Esempio
		
		String[] vettStrings = {"ciao", "gatto" ,"pi"};
		
		for(String parola : vettStrings)
			System.out.println(parola);
		
		*/
		
		
	}

}
