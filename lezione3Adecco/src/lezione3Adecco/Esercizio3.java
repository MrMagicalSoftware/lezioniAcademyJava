package lezione3Adecco;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		/*
		 *  AND LOGIGO
		 *  
		 *  &      &&
		 * 
		 * -------------------
		 * 
		 * OR LOGICO
		 * 
		 * |    ||
		 * 
		 * 
		 * 
		 *  oggiMercoled && isSunny && stoProgrammando
		 *    T          &&  T     &&    T  ----> T
		 * 
		 * 	3 > 1  && 10 > 100 && 4 > 1
		 *      T  &&   F && T ------------> F
		 * 
		 * 
		 * IF(NUM1 == NUM2 && NUM2 == NUM3 ) 
		 * 
		 * Lazy eval
		 * 
		 * 
		 *   && --> LAZY 
		 * 
		 *   0 > 1 && 6 > 4 && 5 > 3 &&  .. . ....
		 * 
		 *    0 > 1 & 6 > 4 & 10 > 3 
		 *    	F   &   T   &   T -----> F  
		 *    
		 * 	
		 * 
		 * 	if( isOkLuci && isOkSpiaMotore && isOkPressione)
		 * 		 f           t                t
		 * 
		 * 	
		 * 
		 *  OR   |    || ---> LAZY 
		 * 
		 * 	1 > 4 || 15 > 10  || 6 > 3 
		 * 	 F    ||  T ----------------------->  T 
		 * 
		 * 
		 * 
		 *  NOT   ! NEGAZIONE
		 * 
		 * 
		 *   ! (  5 > 1  &&  10 > 6 )
		 * 	
		 * 	 ! (   t &&  t ) --->  ! ( t ) ----> false
		 * 
		 * 
		 * 	if( ! (numero1 % 2 == 0)  )  ! negativ
		 * 
		 * 	if( numero1 %2  != 0 ) divero !=
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2 , numero3;
		
		
		System.out.println("insert");
		numero1 = key.nextInt();
		System.out.println("insert");
		numero2 = key.nextInt();
		System.out.println("insert");
		numero3 = key.nextInt();
		
		if(numero1 == numero2 && numero1 == numero3) {
			System.out.println("ok sono uguali");
		}
		else {
			System.out.println("sono diversi");
		}
		
		
		String rispString = (numero1 == numero2 && numero1 == numero3) ? "uguali ": "divisersi";
		
		System.out.println(rispString);
		
		
		
		key.close();
	}
	
}
