package es.cursojava.inicio.metodos.ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
//		String [] usernames = {"Anthony", "Joe", "Sam", "Martha", "Atwon"};
		
		System.out.println("There are " + numberOfNamesWithPattern(args) + " usernames that start with an A and has a t");
		
		
	}
	
	public static int numberOfNamesWithPattern(String [] nombres) {
		int counter = 0;
		
		for(String nombre : nombres) {
			if (nombre.startsWith("A")&& nombre.contains("t")) {
				counter++;
			}
		}
		return counter;
	}
}
