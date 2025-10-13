package es.cursojava.inicio.maps.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.objetos.Alumno;

public class Colegio {

	
	public static void main(String[] args) {
		Colegio colegio = new Colegio();
		
		List<Alumno> alumnos= Alumno.crearAlumno();
		
		
		Map<String, Aula> aulas= Aula.crearAulas(alumnos);
		aulas.size();
//		Aula aula1 = new Aula("1B");
//
//		Aula aula2 = new Aula("2C");
//
//		Aula aula3 = new Aula("3A");
		
		
//		Map<String, Alumno> alumnos = Alumno.crearAlumno();
//		for (String string : args) {
//			
//		}
//		List<Alumno> aula = new ArrayList();
//		
//		
//		Map<String, Aula> aulas = Aula.crearAulas();
//		Map<String, Alumno> aula1 = Alumno.crearAlumno1();
//
//		Map<String, Alumno> aula2 = Alumno.crearAlumno2();
//		Map<String, Alumno> aula3 = Alumno.crearAlumno3();
//		List<Alumno> aula1 = new ArrayList();
//		aula1.add(alumno1);
//		aula1.add(alumno2);
//		
//		List<Alumno> aula2 = new ArrayList();
//		aula1.add(alumno3);
//		
//		List<Alumno> aula3 = new ArrayList();
//		aula1.add(alumno4);
//		aula1.add(alumno5);
//		aula1.add(alumno6);
//		aula1.add(alumno7);
//		
//		List<List<Alumno>> aulas = new ArrayList();
//		Map<String, Aula> colegio = Aula.crearAulas();
//		colegio.get("1C").get

			
		
	}

}
