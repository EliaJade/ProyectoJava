package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[]args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int numberOfStudents = scan.nextInt();
		
		
		double grades[] = new double [numberOfStudents];
		int studentsPassed = 0;
		int i = 0;
		
		
		for(i=0;numberOfStudents>i ; i++) {
			System.out.println("What grade did student " + (i+1) + " get?");
			grades[i] = scan.nextDouble();
			
			
		}
		
//		for(i=0 ; numberOfStudents>i ; i++) {
//			System.out.print(grades[i]);
//			
//		}
		double totalGrades= 0;
		for (double grade : grades) {
			//System.out.println(grade);
			if(grade>=5) {
				studentsPassed++;
			}
			totalGrades += grade;
		}
//			if (grades[0+i]>=5) {
//				studentsPassed++;
//			}
//			 grade = grade + grades[i];
//		}
//		
		System.out.println("The amount of students that passed is " + studentsPassed);
		System.out.println("The average grade of this class is " + totalGrades/numberOfStudents);
	}
}
//https://github.com/ainedit/cursojavagetafe.git
