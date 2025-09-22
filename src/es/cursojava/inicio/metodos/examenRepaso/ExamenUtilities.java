package es.cursojava.inicio.metodos.examenRepaso;

import java.util.Scanner;

public class ExamenUtilities {

	
	
	public static int[] createArray(int number) {
		int[] array = new int[0];
		int i = 0;
		System.out.println("Choose a number");
		Scanner scan = new Scanner(System.in);
		int sizeArray = scan.nextInt();
		if((sizeArray>100)||(sizeArray<0)) {
			System.out.println("That number is invalid, please choose another one");
			sizeArray = scan.nextInt();
		}
		if ((sizeArray<=100)||(sizeArray>=0)){
			array = new int[sizeArray];
//			System.out.println(array.length);
		}
		
		for (int numberArray : array) {
			
			System.out.println("Choose a number");
			scan = new Scanner(System.in);
			 array[i] = scan.nextInt();
			 i++;
		}

//		System.out.println(array[0]);
		return array;
		
		
	}
	
	public static void showArray(int array[]) {
		int j=0;
		for (int number : array) {
			number = array[j] ;
			System.out.println(number);
			j++;
		}

		
		
	}
	
	public static double calculatePromedium(int array[]) {
		double totalNumbers = 0;
		int i = 0;
		for (int number : array) {
			number = array[i];
			totalNumbers = totalNumbers+number;
//			System.out.print(number + "+");
			i++;
		}
//		System.out.println("\n" + totalNumbers);
		double promedium=totalNumbers/(array.length);
//		System.out.println("\n" + promedium);
		return promedium;
	}
	
	public static int[] maxMin(int array[]) {
		int i = 0;
		int max = 0;
		int min = 10000;
		for (int number : array) {
			number = array[i];
			if (number<min) {
				min = number;
			}
			if (number>max) {
				max = number;
			}
			i++;
		}
		int[] maxMinTotal = {min, max};
		System.out.println("Bigger: " + max + "\nSmaller: " + min);
		return maxMinTotal;
	}
	
	public static int[] filterBiggerThanPromedium(int array[], double promedium) {
		int i = 0;
		int biggerThan = 0;
		int x = 0;

		for( int numbers : array) {
			
			if(numbers>=promedium) {
				biggerThan++;
				System.out.println(array[i]);
			}
			i++;
		}

		int numbersHigher[]= new int [biggerThan];

		System.out.println(numbersHigher.length);
//		for(int numbers : numbersHigher) {
//			 numbers = numbersHigher[i];
//			System.out.println(numbersHigher[i]);
//			i++;
//		}
		return numbersHigher;
	}
	
	
}
