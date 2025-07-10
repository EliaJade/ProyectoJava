package es.cursojava.inicio.String.ejercicios;

public class Ejercicio3 {

	public static void main(String[]args) {
		
		String sentance= "En un lugar de la Mancha de cuyo nombre no puedo acordarme";
		
		String sentanceLowerCase = sentance.toLowerCase();
		char character;
		int counterA = 0;
		int counterE = 0;
		int counterI = 0;
		int counterO = 0;
		int counterU = 0;
		
		for (int i=0; i<sentanceLowerCase.length(); i++ ) {
			character = sentanceLowerCase.charAt(i);
			
			if (character == 'a') {
				counterA++;
			}
			if (character == 'e') {
				counterE++;
			}
			if (character == 'i') {
				counterI++;
			}
			if (character == 'o') {
				counterO++;
			}
			if (character == 'u') {
				counterU++;
			}
			
			}
		int totalVowels = counterA + counterE + counterI +  counterU + counterO;
		System.out.println("In this sentance there is " + counterA + 
				" A's.\n\nIn this sentance there is " + counterE + 
				" E's.\n\nIn this sentance there is " + counterO + 
				" O's.\n\nIn this sentance there is " + counterI + 
				" I's.\n\nIn this sentance there is " + counterU + 
				" U's.\n\n"
				+ "There is a total of " + totalVowels + " vowels in this sentance.");
		
	}
}
