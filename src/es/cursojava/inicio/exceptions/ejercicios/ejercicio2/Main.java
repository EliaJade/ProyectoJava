package es.cursojava.inicio.exceptions.ejercicios.ejercicio2;

import es.cursojava.utilidades.SimUtils;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Dog[] dogs = new Dog[5];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i]= main.crearDog();
		}
		main.imprimirArrayDog(dogs);
	}

	public Dog crearDog() {
		try {
			String nombre = SimUtils.pideDatoCadena("Dime el nombre del perro");
		
		double nota = SimUtils.pideDatoNumerico("Dime la nota de la competicion del perro");
		int edad = SimUtils.pideDatoNumerico("Dime la edad del perro");
		
		Dog dog = new Dog(nombre, edad, nota);
		return dog;
		}
		catch(IllegalArgumentException iae){
			System.err.println("No se ha introducuido los datos bien. " +iae.getMessage());
			
		}
		catch(NotaInvalidaException nie) {
			System.err.println("No se ha introducuido los datos bien. " +nie.getMessage());
			
		}
		return null;
	}
	
	public void imprimirArrayDog(Dog[] dogs) {
		int i=0;

		for (Dog dog : dogs) {
		try {
			System.out.println("Dog " + i + ": " + dog.getNombre());
			
		}
		
		catch(NullPointerException npe){
			System.err.println("No hay perro aqui, porque no se ha introducido sus datos bien");
			
		}
		i++;
		}
		}
	
}
