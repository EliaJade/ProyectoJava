package es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;

public class Manzana extends Alimentos {
	
	String color;

	public Manzana(String id, String nombre, int precio, String fechaCaducidad, String color) {
		super(id, nombre, precio, fechaCaducidad);
		this.color=color;
	}

	
	
	
}
