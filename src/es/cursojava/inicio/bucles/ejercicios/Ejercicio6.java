package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String[] args) {
		
		System.out.println("EXERCISE 6:");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a number");
		int result = 0;
		int number = scan.nextInt();
		
		while (number>=1) {
		
			if (number%2==0) {
			number = number/2;
			//number/=2
			System.out.println(number);
			}
			if (number<=1) {
				break;
			}
			if (!(number%2==0)) {
				number = number*3+1;
				System.out.println(number);
			}
			
		}
		
	}
}
