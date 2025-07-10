package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main( String[] args) {
		
	System.out.println("EXERCISE 9:");
			
			Scanner scan = new Scanner(System.in);
			
			String email;
			int optionChose = 0;
			
			while (!(optionChose==4)) {
				System.out.println("Choose an option: (write the number)");
				System.out.println("1.Paint a Square");
				System.out.println("2.Validate an email");
				System.out.println("3.Add a Student");
				System.out.println("4.Exit");
				optionChose= scan.nextInt();
			String option = switch (optionChose) {
			
			case 1 -> "Paint a square";
			case 2 -> "Validate an email";
			case 3 -> "Add a student"; 
			case 4 -> "Exit"; 
			default -> "You have not selected an option, please pick a number.\n";
		};
		if (option.equals("Paint a square") || option.equals("Validate an email") || option.equals("Add a student")) {
			System.out.println("You have chosen the option: " + option + "\n");
		} else if (option.equals("Exit")){
			System.out.println("Goodbye");
		} else {
			System.out.println(option);
		}
			if (option.equals("Paint a square")) {
				System.out.println("How big do you want the square?");
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
			while(option.equals("Validate an email")) {
				scan = new Scanner(System.in); 
				
				System.out.println("Write the email you wish to validate");
				email = scan.nextLine();
				
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
				//System.out.println(afterArroba);
				
				//beforeDot = beforeDot + email.indexOf(".");
				beforeDot = beforeDot + email.lastIndexOf(".");
				//System.out.println(beforeDot);
				//System.out.println(emailLength);
				inbetweenArrobaDot = -emailLength+beforeDot+afterArroba;
				
				//System.out.println(inbetweenArrobaDot);
				
				afterDotLength = afterDotLength + email.lastIndexOf(".");
				//System.out.println(afterDotLength);
				afterDotLength = emailLength-afterDotLength-1;
				//System.out.println(afterDotLength);
				 
				emailAfterDot = email.substring(beforeDot+1);
				//System.out.println(emailAfterDot);
				
				
				
				
				if ((email.contains(".")) && (!email.contains(" ")) && (afterDotLength>=2) && (afterDotLength<=6) && (arrobaCounter==1) && (emailAfterArroba.contains("."))&&(inbetweenArrobaDot>=2)) {
					System.out.println("Your email " + email + " is valid\n");
					break;
				} 
				else { 
					System.out.println("Your email is invalid\n");
					
				}
			
			}
		}
	}
}
	
