package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
 
	public static void main (String[] args) {
		//EXERCISE 3
		
				System.out.println("EXERCISE 3:");
				
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Give me a number");
				int number1 = scan.nextInt();
				
				scan = new Scanner(System.in);
				
				System.out.println("Give me another number");
				int number2 = scan.nextInt();
				
				scan = new Scanner(System.in);
				
				System.out.println("What operation would you like to do?");
				System.out.println("Add");
				System.out.println("Subract");
				System.out.println("Multiply");
				System.out.println("Divide");
				
				scan = new Scanner(System.in);
				
				String action = scan.nextLine();
				String operationType = "";
				int result = 0;
				if (action.equalsIgnoreCase("add") || action.equals("+")) {
					result = number1 + number2;
					operationType = "+";
//					System.out.println(number1 + "+" + number2 + "=" + resultAdd);
//					System.out.println("The result is " + resultAdd);
				
				} else if (action.equalsIgnoreCase("subract") || action.equals("-")) {
					result = number1 - number2;
					operationType = "-";
//					System.out.println(number1 + "-" + number2 + "=" + resultSubtract);
//					System.out.println("The result is " + resultSubtract);
				
				} else if (action.equalsIgnoreCase("multiply") || action.equals("*") || action.equals("x")) {
					result = number1 * number2;
					operationType = "x";
//					System.out.println(number1 + "x" + number2 + "=" + resultMultiply);
//					System.out.println("The result is " + resultMultiply);
					
				} else if (action.equalsIgnoreCase("divide") || action.equals("/")) {
					result = number1 / number2;
					operationType = "/";
//					System.out.println(number1 + "/" + number2 + "=" + resultMultiply);
//					System.out.println("The result is " + resultMultiply);
					
				} else {
					System.out.println("You didn't select an operation");
				}
				
				System.out.println(number1 + operationType + number2 + "=" + result);
				System.out.println("The result is 6" + result);
			

	}
}
