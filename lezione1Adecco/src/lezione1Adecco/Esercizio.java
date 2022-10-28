package lezione1Adecco;

/**
 * 
 * (1 °C × 9/5) + 32 = 33,8 °F
 * 
 * 
 * si crea una variabile che
 * e' in grado di rappresentare
 * la temperatura in gradi 
 * 
 *   19 gradi celcius
 *   tot  gradi kelvin
 *   tot  gradi far
 * 
 * @author mr
 *
 */


public class Esercizio {

	public static void main(String[] args) {

		int myTempCelcius = 19;
		
		
		
		double far = (myTempCelcius * 9 / 5 ) + 32;
		
		System.out.println("FAR " + far);
		
		
		double ciaoAtuttiValoreEccoQui = 10;
		
		
		
		
		
		// 10  * 9   /  5  ==> 18 
		// 10  * ( 9 / 5 ) ==
		
		//double ris = 10  * 9   /  5 ;
		//double ris2 = 10  * ( 9.0 / 5 );
		
		//System.out.println(ris);
		//System.out.println(ris2);
		
		
		
		System.out.println( "kelvin-->" + ( myTempCelcius +  273.15));
		
		
		
		
		
	}

}
