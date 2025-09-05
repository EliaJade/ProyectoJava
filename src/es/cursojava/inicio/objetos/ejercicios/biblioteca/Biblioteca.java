package es.cursojava.inicio.objetos.ejercicios.biblioteca;

import java.util.Arrays;

public class Biblioteca {

	private String name;
	private Libro[] libros;
	private Direccion direccion;
	
	
	//CONSTRUCTOR
	
	public Biblioteca(String name, Libro[] libros, Direccion direccion) {
		this.name=name;
		this.libros=libros;
		this.direccion=direccion;
	}

	
	
	//GET & SET
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Libro[] getLibros() {
		return libros;
	}
	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	//METODOS
	
	public Libro addLibro(Libro libro) {
		return libro;
	}
	
	
	public Libro[] showLibros() {
		return libros;
	}
	
	public void showInfoBiblioteca() {
		System.out.println("LIBRARY:\n\tNAME: " + name + "\n\tBOOKS: " + libros.length + "\n\tADDRESS: " + direccion.getStreet() + direccion.getCity() + direccion.getPostCode());
	}
	
	
	
}
