package lezione15Adecco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestFunzioni {

	@Test
	public void test() {
		
		boolean[] vett = { true , true , false };
		boolean[] vett2 = { false , true , false };

		boolean[] vett3 = { false , true , false , true };

		EsercizioFunzioni esercizioFunzioni = new EsercizioFunzioni();
		
		assertTrue(esercizioFunzioni.isMaggioriSuperiori(vett));
		
		
		assertFalse(esercizioFunzioni.isMaggioriSuperiori(vett2));
		
		assertTrue(esercizioFunzioni.isMaggioriSuperiori(vett3));

		
	}
	
	
	@Test
	public void testContaCaratteri() {
		
		ArrayList<String> myArrayList = new ArrayList<>();
		myArrayList.add("ciao");
		myArrayList.add("miao");
		myArrayList.add("c");

		EsercizioFunzioni esercizioFunzioni = new EsercizioFunzioni();

		
		assertTrue(9 == esercizioFunzioni.contaCaratteriTotali(myArrayList));
		assertEquals(9, esercizioFunzioni.contaCaratteriTotali(myArrayList));
		
		/**
		 * 
		 * Classi wrapper :
		 * 
		 * int ----------> Integer
		 * double -------_> Double
		 * char --------->  Character
		 * bool  --------> Boolean
		 * 
		 * 
		 * 	ArrayList<Integer> myArrayList2 = new ArrayList<>();
			ArrayList<Character> myArrayList3 = new ArrayList<>();
			ArrayList<Double> myArrayList4 = new ArrayList<>();
			ArrayList<Boolean> myArrayList5 = new ArrayList<>();
		 * 
		 * 
		 * 
		 */
	

		
	}
	
	
	
	

}
