package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		String answer = "";
		int contador = 0;
		
		do {
			
			System.out.println("Hola");
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want to continue?");
			answer = scan.nextLine();
			
			contador++;
			
			if (contador==3) {
				break;
			}else {
				continue;
				
			}
			
			
		}while (answer.equals("yes")/*&& contador==2*/);

		System.out.println("Termina");
	}

}
