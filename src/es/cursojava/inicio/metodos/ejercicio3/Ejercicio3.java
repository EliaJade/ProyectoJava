package es.cursojava.inicio.metodos.ejercicio3;

import java.util.Arrays;

public class Ejercicio3 {

	
	public static void main(String[]args) {
		int [] numbers= {5,3};
		
		double []results = calculations(numbers);
		
		for (double result : results) {
			System.out.println(result);
			
		}
		
		System.out.println(Arrays.toString(results));
		
	}
	
	public static double[] calculations(int[] numbers) {
		double answer[]= new double [3];
		
		 int base = numbers[0];
		 int height = numbers[1];
		 
		 answer[0]= base*height;
		 answer[1]= 2*(base+height);
		 answer[2]= Math.sqrt(base*base+Math.pow(height, 2));
		 
		 
		
		
		return (answer);
	}
}
