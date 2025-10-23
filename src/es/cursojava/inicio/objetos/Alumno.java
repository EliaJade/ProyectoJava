package es.cursojava.inicio.objetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

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


	
	
	public Alumno () {
		
	} 
	
	public Alumno (String name, String dni) {
		this.name = name;
		this.dni = dni;
	}
	public Alumno (String name, String dni,  double notaMedia) {
		this.name = name;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}
	
	public Alumno (String name, String dni, double notaMedia, String[] asignaturas) {
		this.name = name; 
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}
	
	//METODOS
	public static List<Alumno> crearAlumno() {
		Alumno alumno1 = new Alumno("Elia", "Z111", 9.2);
		Alumno alumno2 = new Alumno("Ray", "Y111", 10);
		Alumno alumno3 = new Alumno("Samuel", "F222", 3.5);
		Alumno alumno4 = new Alumno("Kai", "037H", 5.6);
		Alumno alumno5 = new Alumno("Lua", "R213", 6.9);
		Alumno alumno6 = new Alumno("Mia", "331F", 1);
		Alumno alumno7 = new Alumno("Natalia", "L329", 8.9);
		List<Alumno> alumnos = new CopyOnWriteArrayList();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add( alumno3);
		alumnos.add( alumno4);
		alumnos.add( alumno5);
		alumnos.add( alumno6);
		alumnos.add( alumno7);
		return alumnos;
	}
	public static Map<String, Alumno> crearAlumno1() {
	
		Alumno alumno3 = new Alumno("Samuel", "F222");
		
		Map<String,Alumno> alumnos = new HashMap();
		
		alumnos.put(alumno3.getDni(), alumno3);
		
		return alumnos;
	}
	public static Map<String, Alumno> crearAlumno2() {
		Alumno alumno1 = new Alumno("Elia", "Z111");
		Alumno alumno2 = new Alumno("Juan", "Y111");
		
		Map<String,Alumno> alumnos = new HashMap();
		alumnos.put(alumno1.getDni(), alumno1);
		alumnos.put(alumno2.getDni(), alumno2);
		
		return alumnos;
	}
	public static Map<String, Alumno> crearAlumno3() {
		
		Alumno alumno4 = new Alumno("Kai", "037H");
		Alumno alumno5 = new Alumno("Lua", "R213");
		Alumno alumno6 = new Alumno("Mia", "331F");
		Alumno alumno7 = new Alumno("Natalia", "L329");
		Map<String,Alumno> alumnos = new HashMap();
		
		alumnos.put(alumno4.getDni(), alumno4);
		alumnos.put(alumno5.getDni(), alumno5);
		alumnos.put(alumno6.getDni(), alumno6);
		alumnos.put(alumno7.getDni(), alumno7);
		return alumnos;
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
	
}