package es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;

public class Platano extends Alimentos {
	
	String color;
	
	
	public Platano(int id, String nombre, double precio, String fechaCaducidad, String color) {
		super(id, nombre, precio, fechaCaducidad);
		this.color=color;
	}
	public Platano(int id, String nombre, double precio, int cantidad) {
		super(id, nombre, precio, cantidad);
	}
	
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
	
	
}