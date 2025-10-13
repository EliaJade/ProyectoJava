package es.cursojava.inicio.maps.ejercicios.ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.objetos.Alumno;
import es.cursojava.inicio.objetos.herencia.ejercicios.hospital.Persona;

public class Aula {
	
	private String numeroPuerta;
	private List<Alumno> alumnos;
	
	public Aula(String numeroPuerta) {
		super();
		this.numeroPuerta = numeroPuerta;
	}

	public String getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(String numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}
	 
	
	//METODOS
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public static Map<String, Aula> crearAulas(List<Alumno> alumnos) {

		Aula aula1 = new Aula("1B");

		Aula aula2 = new Aula("2C");

		Aula aula3 = new Aula("3A");
		List<Alumno> rango = alumnos.subList(1, 2);

		List<Alumno> rango2 = alumnos.subList(3,3);

		List<Alumno> rango3 = alumnos.subList(4, 7);
		
		aula1.setAlumnos(rango);
		aula2.setAlumnos(rango2);
		aula3.setAlumnos(rango3);
		
		Map<String, Aula> aulas = new HashMap();
		aulas.put("1B", aula1);
		aulas.put("2C", aula2);
		aulas.put("3A", aula3);
		
		return aulas;
	}

}
