package es.cursojava.inicio.exceptions.ejercicios.ejercicio2;

public class Dog {

	private String nombre;
	private int edad;
	private double notaCompeticion;
	public Dog(String nombre, int edad, double notaCompeticion) throws NotaInvalidaException {
		if(edad<=0) {
			throw new IllegalArgumentException("La edad tiene que ser mayor de 0");
		}
		if(notaCompeticion<0 || notaCompeticion>10) {
			throw new NotaInvalidaException("La nota no puede ser mayor que 10 o menor que 0");
		}
		this.nombre=nombre;
		this.edad = edad;
		this.notaCompeticion = notaCompeticion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws NotaInvalidaException {
		this.edad = edad;
	}
	public double getNotaCompeticion() {
		return notaCompeticion;
	}
	public void setNotaCompeticion(double notaCompeticion) {
		this.notaCompeticion = notaCompeticion;
	}
	
	
}
