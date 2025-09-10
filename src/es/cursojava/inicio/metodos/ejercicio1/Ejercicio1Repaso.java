package es.cursojava.inicio.metodos.ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1Repaso {

	public static void main(String[]args) {
		System.out.println("Choose a number.");
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		
		
		
		tablaDeMutiplicar1(number);
		
		
		System.out.println("Choose another number");
		
		scan = new Scanner (System.in);
		int number2 = scan.nextInt();
		
		tablaDeMultiplicar2(number, number2);
	}
	public static void tablaDeMutiplicar1(int number){
		for (int i = 0; i < 11 ;i++) {
			int resultNumber= number*i;
			System.out.println(number + "x" + i + "=" + resultNumber);
		}
		
		
	}
	
	
	
	public static void tablaDeMultiplicar2(int number, int number2) {
		for(int i = 0 ; i <= number2 ; i++) {
			int resultNumber= number*i;
			System.out.println(number + "x" + i + "=" + resultNumber);
			
			}
		for(int j = 0 ; j <= number ; j++) {

			
			int resultNumber2= number2*j;
			System.out.println(number2 + "x" + j + "=" + resultNumber2);
		}
	}
}
