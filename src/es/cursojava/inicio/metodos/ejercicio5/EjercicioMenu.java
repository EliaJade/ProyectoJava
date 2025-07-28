package es.cursojava.inicio.metodos.ejercicio5;

import java.util.Scanner;

public class EjercicioMenu {
	
	public static void main(String[]args) {
		
		
		
		String [] menu = {
				"1.Paint a Square",
				"2.Validate an email",
				"3.Add a Student",
				"4.Exit"
		};
		String optionText = "Choose an option: (write the number)";
		int optionChose = 0;
		
		
		while (!(optionChose==4)) {
			paintMenu(menu, optionText);
			
			optionChose = optionAction(optionChose);
			
			optionActionIs1(optionChose);
			String emailAdress= optionActionIs2(optionChose);
			System.out.println(emailAdress);
			optionAction3(optionChose); 
		}
		
		
	}
		
	public static void paintMenu (String[] options, String text) {
		
		for (String option : options) {
			System.out.println(option);
			
		}
		
		System.out.println(text);
		
	}
	
	public static int optionAction(int number) {
		
		Scanner scan = new Scanner(System.in);
		number= scan.nextInt();
		String text = "You have chosen option: ";
		 String textOption = "";
		 String goodbyeText = "";
		
		if (number==1) {
			
			 textOption = "Paint a square";
			
		}
		else if (number==2) {
			 textOption = "Validate an email";
			
		}
		else if (number==3) {
			 textOption = "Add a student";
			
		}
		else if (number==4){
			 textOption = "Exit";
			 goodbyeText = "Goodbye!";
			
			
		}
		else {
			 text = "You haven't choose an option";
			
			
		}
		
		System.out.println(text + textOption +"\n" + goodbyeText);
		
		return (number);
	}
	
	public static void optionActionIs1 (int number) {
		if (number == 1) {
			System.out.println("How big do you want the square?");
			Scanner scan = new Scanner (System.in);
			int size = scan.nextInt();
			for (int j = 1; j<=size; j++) {
				for (int i = 1 ; i<=size;i++) {
					if (j==1 || j==size || (i==1 || i==size)){
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
						
					}
				}
				System.out.println();
			} 
		}
	}
	
	public static String optionActionIs2 (int number) {
	String email = "";
		while (number == 2) {
			System.out.println("Write the email you wish to validate");
			Scanner scan = new Scanner (System.in);
			email = scan.nextLine();
			
			email.strip();
			
			if (email.isBlank()||(email.isEmpty())) {
				System.out.println("You haven't written an email address");
			}
			
			
			int emailLength = email.length();
			int afterDotLength = 0;
			char arroba = ' ';
			int arrobaCounter = 0;
			int afterArroba = 0;
			int beforeDot = 0;
			int inbetweenArrobaDot = 0;
			String emailAfterDot = "";
			String emailAfterArroba = "";
			
			for(int i=0; i<email.length() ;i++) {
				arroba = email.charAt(i);
				if (arroba == '@'){	
					arrobaCounter++;
				}
			}
			
			afterArroba = afterArroba + email.lastIndexOf("@");
			emailAfterArroba = email.substring(afterArroba+1);
			afterArroba = emailLength-afterArroba-1;
			
			
			beforeDot = beforeDot + email.lastIndexOf(".");
			
			
			inbetweenArrobaDot = -emailLength+beforeDot+afterArroba;
			
			
			afterDotLength = afterDotLength + email.lastIndexOf(".");
			
			afterDotLength = emailLength-afterDotLength-1;
			
			 
			emailAfterDot = email.substring(beforeDot+1);
			
			
			
			
			
			if ((email.contains(".")) && (!email.contains(" ")) && (afterDotLength>=2) && (afterDotLength<=6) && (arrobaCounter==1) && (emailAfterArroba.contains("."))&&(inbetweenArrobaDot>=2)) {
				System.out.println("Your email " + email + " is valid\n");
				
				break;
				
			} 
			else { 
				System.out.println("Your email is invalid\n");
				
			}
			
		
		}
		
		return(email);
	}
	
	public static String[][] optionAction3 (int number) {
		String students[][]= new String [2][3];
		if (number == 3) {
			

			
			
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
								
								
							}
						
						}
						if(found == false) {
							System.out.println("There's no student with that name\n");
						}
						
					}	
				}
			}
									
				
			
		}
		return (students);
	}
	
}
