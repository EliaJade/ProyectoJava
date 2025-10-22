package es.cursojava.inicio.maps.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<Alumno> alumnos= Alumno.crearAlumno();
		this.aulas = Aula.crearAulas(alumnos);
	}
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}
	
	public static void main(String[]args) {
		
		List<Colegio> colegios = crearColegios(); //utils 

		
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
	
	public List<Colegio> crearColegios() {
		Colegio colegio1 = new Colegio("Saint Joe", "Queen's Street");
		Colegio colegio2 = new Colegio("Saint Chris", "King's Street");
		Colegio colegio3 = new Colegio("Saint Samantha", "Princess Street");
		colegio1.setAulas(getAulas());
		colegio2.setAulas(getAulas());
		List<Colegio> colegios = new ArrayList();
		colegios.add(colegio1);
		colegios.add(colegio2);
		colegios.add(colegio3);
		

		return colegios;

	}
	
	
	
	
}
