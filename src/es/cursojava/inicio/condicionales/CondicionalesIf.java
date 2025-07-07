package es.cursojava.inicio.condicionales;

import java.util.Scanner;

public class CondicionalesIf {

	public static void main(String[] args) {
		
		
		String nameStudent = "Elia";
				
		//int number = (int) Math.random()*10;
		//will always give 0 because its not doing the calculation before getting rid of the decimals
		//the parenthesis allows it to do the calculation before removing the decimals
		int number = (int) (Math.random()*10);
		System.out.println(number);
		
		//EXERCISE  1
		
		System.out.println("EXERCISE 1:");
		
		if (number%2==0) {
			System.out.println("The number " + number + " is even");
		} else {
			System.out.println("The number " + number + " is odd");
		}
		

		//EXERCISE  2
		
		System.out.println("EXERCISE 2:");
		
		if (number>=5 && number<7) {
			System.out.println(nameStudent + " has a Sufficient in Math");
		} else if (number>=7 && number<9) {
			System.out.println(nameStudent + " has a Good in Math");
		} else if (number>=9) {
			System.out.println(nameStudent + " has a Excellent in Math");		
		} else {
			System.out.println(nameStudent + " has a Insufficient in Math");
		}
		
		if (number>=5) {
			System.out.println(nameStudent + " has passed");
		} else {
			System.out.println(nameStudent + " has failed");
		}	
		

		//EXERCISE 3
		
		System.out.println("EXERCISE 3:");
		int number1 = 0;
		int number2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
		number1 = scan.nextInt();
		
		scan = new Scanner(System.in);
		
		System.out.println("Give me another number");
		number2 = scan.nextInt();
		
		scan = new Scanner(System.in);
		
		System.out.println("What operation would you like to do?");
		System.out.println("Add");
		System.out.println("Subract");
		System.out.println("Multiply");
		System.out.println("Divide");
		
		scan = new Scanner(System.in);
		
		String action = scan.nextLine();
		
		if (action == "add" || action == "Add" || action == "+") {
			int resultAdd = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + resultAdd);
			System.out.println("The result is " + resultAdd);
		
		} else if (action == "subract" || action == "Subtract" || action == "-") {
			int resultSubtract = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + resultSubtract);
			System.out.println("The result is " + resultSubtract);
		
		} else if (action == "multiply" || action == "Multiply" || action == "*" || action == "x") {
			int resultMultiply = number1 * number2;
			System.out.println(number1 + "x" + number2 + "=" + resultMultiply);
			System.out.println("The result is " + resultMultiply);
			
		} else if (action == "divide" || action == "Divide" || action == "/") {
			int resultMultiply = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + resultMultiply);
			System.out.println("The result is " + resultMultiply);
			
		} else {
			System.out.println("You didn't select an operation");
		}
		
		System.out.println();
	}

}
