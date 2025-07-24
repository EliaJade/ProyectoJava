package es.cursojava.inicio.metodos.ejercicio4;

import java.util.Scanner;


public class Utilidades {

	

	public static void main(String[]args) {
	
		String[] menu = {"1.Paint a square", "2.Validate an email", "3.Add a student", "4.Exit" };
		String text = "\nChoose an option :)";
		
		String textUser = "Paint A sQuare";
		
	
		paintMenu(menu);
		
		paintMenu(menu, text);
		
		pideDatoNumerico(textUser);
		
		pideDatoCadena(textUser);
		
		int number = pideDatoNumerico(textUser);
		
		System.out.println(number);
		
		
	}
	
	
	public static void paintMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
		System.out.println("\nChoose an option\n");

		
		
	}
	
	public static void paintMenu(String[]options, String text) {
		for(String option : options) {
			System.out.println(option);
		}
		System.out.println(text);
		
	}
	
//	public static int pideDatoNumerico(String[]args) {
//		int optionChose=0;
//		
//		for (String arg : args) {
//			arg.toLowerCase()
//;			if (arg.contains("paint")||arg.contains("square")) {
//				optionChose = 1;
//				System.out.println("You chose option " + optionChose);
//				
//			}
//			else {
//				optionChose = 4;
//				System.out.println("Goodbye!");
//			}
//		}
//		return (optionChose);
//		
//		
//		
//	}
	
//	public static int pideDatoNumerico(String textUser) {
//		int optionChose=0;
//		
//		textUser = textUser.toLowerCase();
//		if (textUser.contains("paint")||textUser.contains("square")) {
//				optionChose = 1;
//				System.out.println("You chose option " + optionChose);
//				
//			}
//			else {
//				optionChose = 4;
//				System.out.println("Goodbye!");
//			}
//		return (optionChose);
//		
//		
//		
//	}
	
	public static int pideDatoNumerico(String textUser) {
		System.out.println("How old are you?");
		Scanner scan = new Scanner (System.in); 
		
		int age = scan.nextInt();
		return (age);
		
		
		
	}
	
	public static String pideDatoCadena(String textUser) {
		String optionChose="0";
		
		textUser = textUser.toLowerCase();
		if (textUser.contains("paint")||textUser.contains("square")) {
				optionChose = "1";
				System.out.println(":) You chose option " + optionChose);
				
			}
			else {
				optionChose = "4";
				System.out.println("Goodbye!");
			}
		return (optionChose);
		
		
		
	}
}
