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

	public static Map<String, List<Alumno>> crearAulasCole1(List<Alumno> alumnos) {
//
//		Aula aula1 = new Aula("1B");
//
//		Aula aula2 = new Aula("2C");
//
//		Aula aula3 = new Aula("3A");
		List<Alumno> rango = alumnos.subList(0, 1);

		List<Alumno> rango2 = alumnos.subList(1,2);

		List<Alumno> rango3 = alumnos.subList(2, 3);
//		
//		aula1.setAlumnos(rango);
//		aula2.setAlumnos(rango2);
//		aula3.setAlumnos(rango3);
		
		Map<String, List<Alumno>> aulasCole1 = new HashMap();
		aulasCole1.put("1B", rango);
		aulasCole1.put("2C", rango2);
		aulasCole1.put("3A", rango3);
		
		return aulasCole1;
	}
	public static Map<String, List<Alumno>> crearAulasCole2(List<Alumno> alumnos) {
		//
//				Aula aula1 = new Aula("1B");
		//
//				Aula aula2 = new Aula("2C");
		//
//				Aula aula3 = new Aula("3A");
				List<Alumno> rango = alumnos.subList(3, 5);

//				
//				aula1.setAlumnos(rango);
//				aula2.setAlumnos(rango2);
//				aula3.setAlumnos(rango3);
				
				Map<String, List<Alumno>> aulasCole2 = new HashMap();
				aulasCole2.put("1A", rango);
				
				return aulasCole2;
	}
	public static Map<String, List<Alumno>> crearAulasCole3(List<Alumno> alumnos) {
		//
//				Aula aula1 = new Aula("1B");
		//
//				Aula aula2 = new Aula("2C");
		//
//				Aula aula3 = new Aula("3A");
				List<Alumno> rango = alumnos.subList(5, 6);

				List<Alumno> rango2 = alumnos.subList(6,7);
//				
//				aula1.setAlumnos(rango);
//				aula2.setAlumnos(rango2);
//				aula3.setAlumnos(rango3);
				
				Map<String, List<Alumno>> aulasCole3 = new HashMap();
				aulasCole3.put("1D", rango);

				aulasCole3.put("2A", rango2);
				
				return aulasCole3;
	}

}
