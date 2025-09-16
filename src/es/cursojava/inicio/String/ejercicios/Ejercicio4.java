package es.cursojava.inicio.String.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[]args) {
		System.out.println("EJERCICIO 4 DE STRINGS");
		
		Scanner scan = new Scanner (System.in);
		String sentance = scan.nextLine();
		String word = "";

		sentance = sentance.replace(",", "");
		String wordLongest = "";
		sentance += (" ");
		while(!sentance.isBlank()||!sentance.isEmpty()) {
			int positionWhite = sentance.indexOf(" ");
			word = sentance.substring(0,positionWhite);
			System.out.println(word);
			sentance = sentance.substring(positionWhite+1);
			if(word.length()>wordLongest.length()) {
				wordLongest = word;
			}
		}
		System.out.println("The longest word is " + wordLongest + " with " + wordLongest.length() + " letters" );
		
		
		
		
		
		
		
		
	
	}
}
