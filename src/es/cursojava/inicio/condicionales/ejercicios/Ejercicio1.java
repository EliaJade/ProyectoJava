package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {

			//EXERCISE  1

		System.out.println("EXERCISE 1:");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
		int number = scan.nextInt();
		
		scan = new Scanner(System.in);
		
			
			if (number%2==0) {
				System.out.println("The number " + number + " is even");
			} else {
				System.out.println("The number " + number + " is odd");
			}
			
			boolean resultZero = number%2==0;
			//if boolean gives false it'll enter because of the !, if it didn't have the ! it would enter when giving true.
			if (!resultZero) {
				System.out.println("Entra");
			}
			
			//Operador ternario 
			//condicion?ejecucion_true:ejecucion_false
			System.out.println(number%2==0?"Even":"Odd");
	}
}
