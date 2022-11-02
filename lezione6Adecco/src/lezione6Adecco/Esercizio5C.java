package lezione6Adecco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio5C {

	
	public static void main(String[] args) {
		
		String parola ="ciao";
		
		
		
//		System.out.println(myVar.contains("c"));
//		System.out.println(myVar.contains("i"));
//		System.out.println(myVar.contains("r"));

		
		boolean flag = true;
		
		int index = 0 ;
		while(index < parola.length()) {
			
			String mySingleChar =  parola.charAt(index) + "";
			
			if( !(mySingleChar.contains("a") ||
					mySingleChar.contains("e") ||
					mySingleChar.contains("i") ||
					mySingleChar.contains("i") ||
					mySingleChar.contains("u")))
					flag = false;
			
			index += 2;
		}
		
		if(flag)
			System.out.println("ok");
		else
			System.out.println("no");

		
		System.out.println("####################################à");
		
	    String regex = "[$&@]";
		
	    String input ="cio";
	    
		Pattern pattern = Pattern.compile(regex);
	      //Instantiating the Matcher class
	    Matcher matcher = pattern.matcher(input);
	      //verifying whether a match occurred
	    if(matcher.find()) {
	         System.out.println("Input accepted");
	    }else {
	         System.out.println("Not accepted");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
