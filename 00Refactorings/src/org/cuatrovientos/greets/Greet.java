package org.cuatrovientos.greets;
/**
 * @author Bad Taste
 * greetz in different languages
 */
public class Greet {

	/**
	 * Greets 
	 * @param language chosen language
	 * @param repetitions how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greets (int language, int repetitions) {
		String finalGreet = "";
		String greet = "";
		
		switch (language) {
			case 0 : greet = "hola";
					 break;
			case 1 : greet = "hello";
					 break;
			case 2 : greet = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet repetitions times
		for (int i=0;i<repetitions;i++) {
			finalGreet += greet;
		}
		
		return finalGreet;
	}
}
