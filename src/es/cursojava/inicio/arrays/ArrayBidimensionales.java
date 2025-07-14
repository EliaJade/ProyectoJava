package es.cursojava.inicio.arrays;

public class ArrayBidimensionales {

	public static void main(String[]args) {
		
		int [][] numbers = new int [2][3];
		numbers[1][2]=10;
		System.out.println(numbers[1][1]);
		
		//Number of filas
		System.out.println(numbers.length);
		
		//Number of columnas
		System.out.println(numbers[0].length);
		
		int[]fila0 = numbers[0];
		System.out.println(fila0.length);
		
		//Como recorrer un array bidimensional
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Fila: " + i);
			for(int j=0;j<(numbers[0].length);j++){
				System.out.println("Columna: " + j);	
				System.out.println(+numbers[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
