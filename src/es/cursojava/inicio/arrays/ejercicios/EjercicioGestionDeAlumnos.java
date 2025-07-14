package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioGestionDeAlumnos {

	public static void main(String[] args) {
		String students[][]= new String [2][3];

		
		int i = 0;
		int j = 0;
		Scanner scan = new Scanner (System.in);
		int option = 0;
		String nullCorrector= "(empty)";
		while (!(option==5)) {
			scan = new Scanner (System.in);
			System.out.println("Choose an option: (write the number)");
			System.out.println("1.Insert Students");
			System.out.println("2.Show Students");
			System.out.println("3.Search for a Student");
			System.out.println("4.Delete a Student");
			System.out.println("5.Exit");
			option= scan.nextInt();
		
			scan = new Scanner (System.in);
			if (option>5 || option<1) {
				System.out.println("That option doesn´t exist\n");
				
			}
			
			if(option==1) {
				for (i=0;i<students.length;i++) {
					for (j=0;j<students[0].length;j++) {
						System.out.println("Write the name of the students for class " + (i+1) + " place " + (j+1));
						students[i][j] = scan.nextLine();
					}
				}
			}
			
			if(option==2) {
				for (i=0;i<students.length;i++) {
					System.out.println("In class " + (i+1));
					for (j=0;j<students[0].length;j++) {
						if (students[i][j]==(null)) {
							students[i][j]=nullCorrector;
						}
						System.out.println("Place "+ (j+1)+ ":" + students[i][j]);
					}
				}
			}
			
			if (option==3) {
				scan = new Scanner (System.in);
				System.out.println("What's the name of the student you wish to search for?");
				String studentNameSearch = scan.nextLine();
				for (i=0;i<students.length;i++) {
					//System.out.println("In class " + (i+1));
					for (j=0;j<students[0].length;j++) {
						if(!(students[i][j]==null)) {
							if(students[i][j].equals(studentNameSearch)) {
								//System.out.println(students[i][j]);
								System.out.println("There is a student named " + studentNameSearch + " in class " + (i+1) + " and place " + (j+1) );
							}
//							else {
//								System.out.println("There's no student with that name");
//							}
						}
						
				
					}
				}
				
			}
		}
		System.out.println("Goodbye!");
	}

}
