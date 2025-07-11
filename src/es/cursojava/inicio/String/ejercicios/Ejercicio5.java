package es.cursojava.inicio.String.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[]args) {
		
		String email = "";
		String errorMessage = "";
		Boolean emailInvalid = true;
		
		
//		while (emailInvalid=true) {
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("Write the email you wish to validate");
			email = scan.nextLine();
			
			 email = email.strip();
			
			if (email.isBlank()||(email.isEmpty())) {
				System.out.println("You haven't written an email address");
			}
			

			
			
			if (email.contains(" ")) {
				errorMessage = "It can't have blank spaces.\n";
			}
						
			if(!email.contains("@")) {											//you must make sure there is an arroba otherwise it'll give valid in the position part because it'll give -1 on both the first and last
				errorMessage += "It must have an @\n";
			}
			 
			else if (email.indexOf("@")!=email.lastIndexOf("@")) {				//if the position of the first and last arroba is the same it's because there is only 1
				errorMessage += "It can't have more that 1 @\n";
			}
			
				else {
					String afterArroba1 = email.substring(email.indexOf("@")+1);
					//System.out.println(afterArroba1);
					
					if (!email.contains(".")) {
						errorMessage += "It must have at least 1 dot (.)\n";
					}
					else {
						int positionDot = afterArroba1.indexOf(".");
						if(positionDot<2) {
							errorMessage += "You must have at least 2 letter inbetween @ and .\n";
						}
					}
					
					int afterDot = email.lastIndexOf(".");
					afterDot = email.length()-afterDot-1;
					
					if(afterDot>6 || afterDot<2) {
						errorMessage = "There must be between 2 and 6 letters after the final dot (.)";
					}
				}
			
			if (errorMessage.isEmpty()) {
				System.out.println("Your email " + email + " is valid");
			}
			
	
				System.out.println(errorMessage);

			
			
		}
	
		
	}

