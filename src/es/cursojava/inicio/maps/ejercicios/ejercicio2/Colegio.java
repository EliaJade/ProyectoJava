package es.cursojava.inicio.maps.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.inicio.maps.ejercicios.ejercicio1.Aula;
import es.cursojava.inicio.objetos.Alumno;

public class Colegio {
	
	private String nombre;
	private String direccion;
	private Map<String, List<Alumno>> aulas = new HashMap();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Map<String, List<Alumno>> getAulas() {
		return aulas;
	}
	public void setAulas(Map<String, List<Alumno>> aulas) {
//		List<Alumno> alumnos= Alumno.crearAlumno();
//		this.aulas = Aula.crearAulasCole1(alumnos);
		this.aulas = aulas;
	}
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}
	
	public static void main(String[]args) {
		Colegio colegio23 = new Colegio("Saint Joe", "Queen's Street");
		List<Colegio> colegios = colegio23.crearColegios(); // should make an utils for the metodo and make it static 
		colegio23.mostrarColegios(colegios);
		colegio23.calcularMedia(colegios);
		
	
	}
	
	public List<Colegio> crearColegios() {
		Colegio colegio1 = new Colegio("Saint Joe", "Queen's Street");
		Colegio colegio2 = new Colegio("Saint Chris", "King's Street");
		Colegio colegio3 = new Colegio("Saint Samantha", "Princess Street");

		List<Alumno> alumnos= Alumno.crearAlumno();
		colegio1.setAulas(Aula.crearAulasCole1(alumnos));
		colegio2.setAulas(Aula.crearAulasCole2(alumnos));
		colegio3.setAulas(Aula.crearAulasCole3(alumnos));
		
		Alumno alumnoN = new Alumno ("N", "NNN", 7.0);
		Alumno alumnoE = new Alumno ("E", "EEE", 8.0);
		
//		colegio2.getAulas().get("1A").add(alumnoN); //añadie un alumno a una aula que ya existe
//		colegio2.getAulas().put("aula2", new CopyOnWriteArrayList<Alumno>(Arrays.asList(alumnoN, alumnoE))); //adds new aula to a colegio
//		colegio2.getAulas().get("aula2").add(alumnoE);
//		System.out.println(colegio2.getAulas().get("aulas2"));
		
		List<Colegio> colegios =Arrays.asList(colegio1, colegio2, colegio3);
//		List<Colegio> colegios = new ArrayList();
//		colegios.add(colegio1);
//		colegios.add(colegio2);
//		colegios.add(colegio3);

		return colegios;

	}

	public void mostrarColegios(List<Colegio> colegios) {
		for (Colegio colegio : colegios) {
			System.out.println("Nombre: " + colegio.getNombre() + "\nDireccion: " + colegio.getDireccion());

			Collection<List<Alumno>> listasAlumnos = colegio.getAulas().values();			
			for (List<Alumno> list : listasAlumnos) {
				for (Alumno alumno : list) {
					System.out.println("Alumno: \n\t" + alumno.getName() +"\n\t"+ alumno.getDni() + "\n\t" + alumno.getNotaMedia());
				}
			}
		}
	}
	
	public void calcularMedia(List<Colegio> colegios) {
		 double totalDeColegio = 0;
		 double mayorMedia = 0;
		 String colegioMayorNota = "";
		 Colegio colegioMejor = null;
		for (Colegio colegio : colegios) {
			 double mediaDeColegio = 0;

			 int contadorAlumnosEnColegio = 0;
			Collection<List<Alumno>> listasAlumnos = colegio.getAulas().values();			
			for (List<Alumno> list : listasAlumnos) {
				for (Alumno alumno : list) {
					
					mediaDeColegio = mediaDeColegio + alumno.getNotaMedia();
//					System.out.println(mediaDeColegio);
					contadorAlumnosEnColegio++;
					mayorMedia= mediaDeColegio/contadorAlumnosEnColegio;
				}
			}
			System.out.println("================\n" + colegio.getNombre() + " tiene la media de " + mediaDeColegio/contadorAlumnosEnColegio);
			if(mayorMedia>=totalDeColegio) {
				totalDeColegio = mayorMedia;

//				colegioMayorNota = colegio.getNombre();
				colegioMejor=colegio;
			}
		}
		System.out.println("El colegio " + colegioMejor.getNombre() + " que tiene un " + totalDeColegio);
		
	}
	
	
	
	
	
}
