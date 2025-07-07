package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		System.out.println("EXERCISE 7:");
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many numbers do you want from the Fibonacci Series?");
		
		int amountOfNumbers = scan.nextInt();
//		
//		int result = 0;
//		int numberA = 0;
//		int numberB = 1;
//		System.out.print(numberA + ", " + numberB + ", ");
//		for (int i = 0; i<amountOfNumbers ; i++) {
//			
//			numberA = numberA+numberB;
//			numberB = numberA+numberB;
//			System.out.print(numberA + ", " + numberB + ", " );
//			
//			
//		}
		
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.println("How many numbers do you want from the Fibonacci Series?");
//		
//		int amountOfNumbers = scan.nextInt();
//		
//		int result = 0;
//		int numberA = 0;
//		int numberB = 1;
//		System.out.print(numberA + ", " + numberB + ", ");
//		for (int i = 0; i<amountOfNumbers-2 ; i++) {
//			
//			result = numberA+numberB;
//			System.out.print(result + ", " );
//			numberA = numberB;
//			numberB = result;		
//			
//		}
		
		int result = 0;
		int numberA = 0;
		int numberB = 1;
		
		for (int i = 0; i<amountOfNumbers; i++) {
			System.out.println(numberA);
			
			result = numberA+numberB;
			numberA = numberB;
			numberB = result;
		
			
		}
		
		
		
	}

}
