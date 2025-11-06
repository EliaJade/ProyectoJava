package es.cursojava.inicio.exceptions.ejercicios;

import java.util.Iterator;

import es.cursojava.utilidades.SimUtils;

public class Ejercicio1 {
	

	public static void main(String[] args) {
		Ejercicio1 main = new Ejercicio1();
		int[] array = main.pedirTamañoArray();
		main.pedirNumeros(array);
		main.pedirPosicion(array);
	}
	
	private int[] pedirTamañoArray() {
		int arraySize = SimUtils.pideDatoNumerico("Cuantos numeros quieres apuntar?");
		int numeros[] = new int[arraySize];
		return numeros;
	}
	
	private void pedirNumeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]= SimUtils.pideDatoNumerico("Dime un numero");
		}
	}
	
	private void pedirPosicion(int[] array) {
		int posicion = SimUtils.pideDatoNumerico("Dime una posicion");
		try{

			posicion= posicion-1;
			System.out.println(array[posicion]);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.err.println("Error al obtener la posicion " + posicion + " " + aiobe.getMessage());
		}
	}
}
