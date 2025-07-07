package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println("EXERCISE 4:");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number");
		
		
		int number = scan.nextInt();
		int multiplier = 11;

		
		while (multiplier > 0) {
			
			
			
			int answer = number*multiplier;
			multiplier--;
			System.out.println(number + "x" + multiplier + "=" + answer);
			
			if (multiplier==0) {
				number--;
				multiplier+=10;
				
			} 
			if (number==0) {
				break;
			}
		
		}
		
		for (int multiplierB = 1 ; multiplierB<=number ; multiplierB++ ) {
			System.out.println ("Times table of the number " + multiplierB);
			
			
			
			for (int multiplierA=1; multiplierA<=10; multiplierA++) {
				int answer = multiplierA*multiplierB;
				System.out.println(multiplierB + "x" + multiplierA + "=" + answer);
				
			}
		}
	}
}
