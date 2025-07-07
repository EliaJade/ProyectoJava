package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main (String[] args) {
		
		System.out.println("EXERCISE 4:");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an option: (write the number)");
		System.out.println("1.Paint a Square");
		System.out.println("2.Validate an email");
		System.out.println("3.Add a Student");
		System.out.println("4.Exit");
		
//		int numberChose = scan.nextInt();
//		String optionChose = "";
//		scan = new Scanner(System.in);
//		
//		if (numberChose == 1) {
//			optionChose = "Paint a square";	
//		}
//		else if (numberChose == 2) {
//			optionChose = "Validate an email";	
//		}
//		else if (numberChose == 3) {
//			optionChose = "Add a Student";	
//		}
//		else if (numberChose == 4) {
//			optionChose = "Exit";
//			System.out.println("Goodbye!");	
//		}
//		else {
//			System.out.println("You have not selected an option, please pick a number.");
//		}
//		
//		System.out.println("You have chosen the option: " + optionChose);
//		
		String optionChose = scan.nextLine();
		//Could also be done with int and .nextint
		
		//OLD SWITCH
		
		switch (optionChose) {
		
			case "1" : optionChose = "Paint a square"; break;
			case "2" : optionChose = "Validate an email"; break;
			case "3" : optionChose = "Add a student"; break;
			case "4" : optionChose = "Exit"; break;
			default : System.out.println("You have not selected an option, please pick a number.");
		}
	
		if (optionChose.equals("Paint a square") || optionChose.equals("Validate an email") || optionChose.equals("Add a student")) {
			System.out.println("You have chosen the option: " + optionChose);
		} else if (optionChose.equals("Exit")){
			System.out.println("Goodbye");
		}
		
		//NEW SWITCH
		
		String option = switch (optionChose) {
		
		case "1" -> "Paint a square";
		case "2" -> "Validate an email";
		case "3" -> "Add a student"; 
		case "4" -> "Exit"; 
		default -> "You have not selected an option, please pick a number.";
	};

	if (option.equals("Paint a square") || option.equals("Validate an email") || option.equals("Add a student")) {
		System.out.println("You have chosen the option: " + option);
	} else if (option.equals("Exit")){
		System.out.println("Goodbye");
	} else {
		System.out.println(option);
	}
	}
}
