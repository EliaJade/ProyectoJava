package es.cursojava.inicio.objetos.ejercicios.biblioteca;

import java.util.Arrays;

public class Biblioteca {

	private String name;
	private Libro[] libros;
	private Direccion direccion;
	private int contadorLibros;
	
	
	
	
	//CONSTRUCTOR
	
	public Biblioteca(String name, Direccion direccion, int bookLimit) {
		this.name=name;
		this.libros=new Libro[bookLimit];
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
	
	public void addLibro(Libro libro) {			//hay que pasarle un libro porque esta vacio el array
		if (contadorLibros<=libros.length) {
			libros[contadorLibros]=libro;
			contadorLibros++;
		}else {
			System.out.println("La biblioteca esta llena");
		}
	}
	
	
	public void showLibros() {
		for(Libro libro : libros) {
			if (libro!=null) {     		//Para no dar error cuando la biblioteca esta vacia
				libro.showInfo();
			}
		}
	}
	
	public void showInfoBiblioteca() {
		direccion.showAdress();
		showLibros();
		//System.out.println("LIBRARY:\n\tNAME: " + name + "\n\tBOOKS: " + libros.length + "\n\tADDRESS: " + direccion.getStreet() + direccion.getCity() + direccion.getPostCode());
	}
	
	
	
}
