package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("EXERCISE 2:");
		
		String schoolClass = "Mathematics";
		String nameStudent = "Elia";
		int number = 7;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
		number = scan.nextInt();
		
		scan = new Scanner(System.in);
		
		String finaleGrade = "";
			if (number<5) {
				finaleGrade = "Insufficient";
			} else if (number<7) {
				finaleGrade = "Sufficient";
			} else if (number<9) {
				finaleGrade = "Good";
			} else if (number<=10) {
				 finaleGrade = "Excellent";		
			} else {
				System.out.println("You have input an " + number + ". This grade doesn't exist");
				finaleGrade = "?";
			}
			
			System.out.println(nameStudent + " has a " + finaleGrade + " in " + schoolClass);
			
			if (number<5) {
				System.out.println(nameStudent + " has failed with a " + number);
			} else if (number<=10) {
				System.out.println(nameStudent + " has passed with a " + number);
			} else {
				
			}
			
	}
}
