package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		int[][] numbers = new int [4][4];
		int[][] numbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Scanner scan = new Scanner (System.in);
		int j = 0;
		int i = 0;
		
		//Carga los datos
		for(i = 0; i<numbers.length ; i++) {
			for(j = 0 ; j<numbers[0].length ; j++) {
//				System.out.println("What number in row " + (i+1) + " and column " + (j+1));
//				 numbers[i][j] = scan.nextInt(); 
				}
			}
			
			
		//Pinta los datos
		for(i = 0; i<numbers.length ; i++) {
			System.out.print("\n");
			for(j = 0 ; j<numbers[0].length ; j++) {
			 System.out.print(numbers[i][j] + "\t");
			}
		}
		
		System.out.println("\n\n********************************\n\n");
		
		
		for (int[] fila : numbers) {
			for (int number :fila) {
				System.out.print(number + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n********************************\n\n");
		
		//Diagonal
		
		for(int k = 0;k<numbers.length; k++) {
			System.out.println("The value of position " + k + "," + k + " is " + numbers[k][k]);
		}
		
		System.out.println("\n\n" + numbers[0][0] + "\t\t\t");
		System.out.println("\t" + numbers[1][1] + "\t\t");
		System.out.println("\t\t" + numbers[2][2] + "\t");
		System.out.println("\t\t\t" + numbers[3][3]);
		
		
		//Swap diagonal numbers
		
		for(int k = 0;k<numbers.length/2; k++) {
			int x = numbers[numbers.length-k-1][numbers.length-k-1];
			numbers[numbers.length-k-1][numbers.length-k-1]=numbers[k][k];
			numbers[k][k] = x;
			
		}
		
//		int x = numbers[0][0];
//		numbers[0][0] = numbers[3][3];
//		numbers[3][3] = x;
//		x = numbers[1][1];
//		numbers[1][1] = numbers[2][2];
//		numbers[2][2] = x;
		
		System.out.println("\n\n" + numbers[0][0] + "\t\t\t");
		System.out.println("\t" + numbers[1][1] + "\t\t");
		System.out.println("\t\t" + numbers[2][2] + "\t");
		System.out.println("\t\t\t" + numbers[3][3]);
		
		for(i = 0; i<numbers.length ; i++) {
			System.out.print("\n");
			for(j = 0 ; j<numbers[0].length ; j++) {
			 System.out.print(numbers[i][j] + "\t");
			}
			
		}
		
	}

}
