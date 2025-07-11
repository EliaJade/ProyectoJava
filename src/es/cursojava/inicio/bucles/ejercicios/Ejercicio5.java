package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[] args){
		

		System.out.println("Exercise 5;");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students are in this class?");
		int classAmount = scan.nextInt();
		double amountOfStudents = 0;
		double grade = 0;
		
		amountOfStudents = amountOfStudents + classAmount;
		
		do {
			System.out.println("Write the grade of the student ");
			int studentGrade = scan.nextInt();
			
			classAmount--;
			grade = grade + studentGrade; 
				
		}
		
		while (classAmount > 0); 
		double results = grade/amountOfStudents;
		System.out.println("The average grade of the students is " + results);
		
		
	}

}
