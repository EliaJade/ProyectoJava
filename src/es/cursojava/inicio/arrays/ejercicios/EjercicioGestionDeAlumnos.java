package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioGestionDeAlumnos {

	public static void main(String[] args) {
		String students[][]= new String [2][3];

		
		
		Scanner scan = new Scanner (System.in);
		int option = 0;
		String separator = "\n********************************\n";
		String nullCorrector= "(empty)";
		
		while (!(option==5)) {
			int i = 0;
			int j = 0;
			boolean found = false;
			boolean classFull = false;
			scan = new Scanner (System.in);
			System.out.println(separator);
			System.out.println("Choose an option (write the number):\n");
			System.out.println("1.Insert Students");
			System.out.println("2.Show Students");
			System.out.println("3.Search for a Student");
			System.out.println("4.Delete a Student");
			System.out.println("5.Exit");
			System.out.println(separator);
			option= scan.nextInt();
		
			scan = new Scanner (System.in);
			if (option>5 || option<1) {
				System.out.println("That option doesn´t exist\n");
				
			}
			
			switch(option) {
			
			//OPTION 1
				case 1 -> {
					for (i=0;i<students.length;i++) {
						for (j=0;j<students[0].length;j++) {
							if(students[i][j]==null ) {
								System.out.println("\nWrite student for:"
										+ "\nClass: " + (i+1) + " | Place: " + (j+1));
								students[i][j] = scan.nextLine();
								classFull = true;
								
							}
							if(students[i][j].isBlank()||students[i][j].isEmpty()) {
								students[i][j]=null;
							}
						
						}
					}
					if(!classFull) {
						System.out.println("There's no free spaces");
					}
				}
				
				//OPTION 2
				
				case 2 -> {
					for (i=0;i<students.length;i++) {
						System.out.println("Class " + (i+1) + ":");
						for (j=0;j<students[0].length;j++) {
							
							if (students[i][j]==(null)) {
								System.out.println("\tPlace "+ (j+1)+ ": " + nullCorrector);
							}
							else if(students[i][j]!=null) {
								System.out.println("\tPlace "+ (j+1)+ ": " + students[i][j]);
								}
							
						}
					}
				}
				
				//OPTION 3
				
				case 3 -> {
					scan = new Scanner (System.in);
					System.out.println("What's the name of the student you wish to search for?");
					String studentNameSearch = scan.nextLine();
					

					
					for (i=0;i<students.length;i++) {
						for (j=0;j<students[0].length;j++) {
							if(!(students[i][j]==null)) {
								if(students[i][j].toLowerCase().contains(studentNameSearch.toLowerCase())) {
									//System.out.println(students[i][j]);
									found = true;
									System.out.println( students[i][j] + 
											"\nClass: " + (i+1) + " Place: " + (j+1) + "\n");
								}
								
							}
							
						}
					}
					if(!found) {
						System.out.println("There's no students with that name\n");
					}
					
					
				}
				//OPTION 4
				
				case 4 -> {
					scan = new Scanner (System.in);
					System.out.println("What's the name of the student you wish to delete?");
					String studentNameDelete = scan.nextLine();
					
					for (i=0;i<students.length;i++) {
						for (j=0;j<students[0].length;j++) {
							
								if (studentNameDelete.equalsIgnoreCase(students[i][j])) {
									found = true;
									System.out.println( students[i][j] + 
											"\nClass: " + (i+1) + " Place: " + (j+1) + "\n");
									System.out.println("Are you sure you want to delete " + studentNameDelete + "?");
									scan = new Scanner (System.in);
									String delete = scan.nextLine();
									if (delete.equalsIgnoreCase("yes")) {
										students[i][j]=null;
										
										System.out.println( studentNameDelete + 
												"\nClass: " + (i+1) + " Place: " + (j+1) + " was deleted\n");
									}
									
									
								}
		//						
							
						}
					
					}
					if(found == false) {
						System.out.println("There's no student with that name\n");
					}
					
				}	
			}
		}
								
			
		
		System.out.println("Goodbye!");
	}

}
