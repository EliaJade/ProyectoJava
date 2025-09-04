package es.cursojava.inicio.objetos;

import java.util.Arrays;

public class Alumno {
	private String name;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}


	public void estudiar() {
		System.out.println("The student " + name + " has " + Arrays.toString(asignaturas) + " as their subjects");
		
		if (notaMedia<5) {
			System.out.println(name + " needs to study more!\n");
		} else if (notaMedia>9) {
			System.out.println(name + " is a genius!\n");
		}else {
			System.out.println(name + " has studied a lot!\n");
		}
	}
	
	public Alumno () {
		
	} 
	
	public Alumno (String name, String dni) {
		this.name = name;
		this.dni = dni;
	}
	
	public Alumno (String name, String dni, double notaMedia, String[] asignaturas) {
		this.name = name; 
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}
}