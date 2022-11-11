package com.adecco.lezioneArrayList;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		
		//[           ]
		
		//Arraylist sono flessibili
		//significa che in modo
		//automatico aumentano-diminuiscono
		// la loro dimensione
		
		
		// [  10   , 4 ,  6 ]
		
		// [ 10 , 6 ]
		
		ArrayList<String> vett = new ArrayList<>();
		
		vett.add("ciao");
		vett.add("Rob");
		
		vett.add(0, "hello");
		

		for (int i = 0; i < vett.size() ; i++) {
			System.out.println(vett.get(i));
		}
		
		vett.remove(0);
		
		for( String elemento  :  vett    ) {
			System.out.println(elemento);
		}
		
		
	}

}
