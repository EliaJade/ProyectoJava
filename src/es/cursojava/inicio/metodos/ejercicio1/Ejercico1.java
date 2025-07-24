package es.cursojava.inicio.metodos.ejercicio1;

import java.util.Scanner;

public class Ejercico1 {
	
	public static void main (String[]args) {
System.out.println("Choose a number");
		
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		multiplicationTable1(number);	
		
		System.out.println("Choose two numbers");
//		int multipliers[] = new int [2];
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
//		multipliers[0] = number1;
//		multipliers[1]= number2;
//		multiplicationTable2(multipliers);
		multiplicationTable2(number1, number2);
		
		
	}
	
	private static void multiplicationTable1 (int numberParameter) {
		
		System.out.println("Multiplication table " + numberParameter);
		
		for (int i= 0; i <= 10 ; i++) {
			
			int answer = numberParameter*i;
			System.out.println(numberParameter + "x" + i +"=" + answer);
		
		}
		
	}
	
//	private static void  multiplicationTable2 (int[] numberParameter2) {
		private static void  multiplicationTable2 (int number1, int number2) {
	
		
		
//		for (int i = numberParameter2[0]; numberParameter2[0] < numberParameter2[1]  ; numberParameter2[0]++) {
		for (int i = number1; i <= number2  ; i++) {
			
			multiplicationTable1(number1);
		}
	}

}
