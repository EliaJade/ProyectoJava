package es.cursojava.inicio;

import java.util.Arrays;

public class Calculadora {

	public static void main (String[] calculation) {
		
//		System.out.println("What do you wish to calculate?");
//		Scanner scan = new Scanner(System.in);
//		String calculation = scan.nextLine();
		if (calculation.length<3) {
			System.err.println("There are paramaters missing");
		}
		else {
			
			int result = Integer.parseInt(calculation[1]);
		
			String operationType = calculation [0];
			
			
			System.out.println("We are going to " + operationType + ":");
			System.out.print( Integer.parseInt(calculation[1]));
			for (int i = 2 ; i < calculation.length; i++) {
				
				int number =  Integer.parseInt(calculation[i]);
					
					if (operationType.contains("add")) {
						
						System.out.print("+" + number);
						result += (number);
					
					}
					else if (operationType.contains("minus")) {
						
						System.out.print("-" + number);
						result -= number;
						
					} 
					else if (operationType.contains("multiply")){
						
						System.out.print("x" + number);
						result *= (number);
						
					} else {
						System.err.println("Operación no permitido");
						break;
					}
					
					
				}

			System.out.println("=" +result);
				
				
			}
			
	}

}
	

