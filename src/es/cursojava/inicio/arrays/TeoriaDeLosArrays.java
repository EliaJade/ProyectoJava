package es.cursojava.inicio.arrays;

import java.util.Arrays;

public class TeoriaDeLosArrays {

	public static void main(String[] args) {
		String[] colores = new String [4];
		colores[0] = "Azul";
		colores[1] = "Rojo";
		//colores[4] = "Naranja";						//ArrayOutOfBoundsException
		colores[colores.length-1] = "Naranja";			//Position 3 
		System.out.println(colores[3]);
		
		int[] numbers = {8,9,6,67,8,90};
		
		System.out.println(numbers[4]);
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		double [] notas = new double [15];
		System.out.println(notas[0]);
		

		
	}
	
	

}
