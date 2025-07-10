package es.cursojava.inicio.String.ejercicios;

public class Ejercicio1 {
	
	public static void main(String[]args) {
		
		System.out.println("EJERCICIO 1 DE STRINGS");
		
		String word = "Dog";
		String wordBackwards = "";
//		char lastLetter = ' ';
		
		for ( int i=word.length()-1 ; i>=0 ; i --) {
			wordBackwards = wordBackwards + word.charAt(i);
			
//			lastLetter = word.charAt(i);
//			lastLetter = word.charAt(word.length()-1);
			
			
			
		}
		System.out.println(wordBackwards);
		
	}
}
