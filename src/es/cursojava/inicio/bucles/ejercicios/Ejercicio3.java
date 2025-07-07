package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numberOfFives = 0;
		int numberOfThrees = 0;

		System.out.println("EXERCISE 3:");
		int i = 10;

		while (i > 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Write a number.(You will be writing a total of 10 number)");
			int number = scan.nextInt();
			i--;

			if (number % 3 == 0) {
				numberOfThrees++;
				//System.out.println(number + "is a multiplier of 3");
			}

			if (number % 5 == 0) {
				numberOfFives++;
				//System.out.println(number + "is a multiplier of 5");
			}

		}
		System.out.println("There is a total of " + numberOfFives + " numbers that are multilpe of 5");
		System.out.println("There is a total of " + numberOfThrees + " numbers that are multilpe of 3");
	}
}
