package es.cursojava.inicio.String.ejercicios;

public class Ejercicio0 {

	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 0 DE STRINGS");
		
		String cadena = "Esto es una prueba de Strings.";
		
		String cadena3 = cadena.substring(cadena.indexOf("e")+1);
		System.out.println(cadena3.indexOf("e")+cadena.indexOf("e")+1);
		
		//Correct way:
		int cadena2 = cadena.indexOf("e",cadena.indexOf("e")+1);
		System.out.println(cadena2);
		
		
		
		
		
	}
}
