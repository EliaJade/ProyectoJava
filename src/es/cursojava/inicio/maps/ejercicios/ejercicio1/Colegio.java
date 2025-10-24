package es.cursojava.inicio.maps.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.objetos.Alumno;

public class Colegio {

	
	public static void main(String[] args) {
		Colegio colegio1 = new Colegio();	
		List<Alumno> alumnos= Alumno.crearAlumno();
		
		
		Map<String, List<Alumno>> aulas= Aula.crearAulasCole1(alumnos);
		
		Collection<List<Alumno>> listasAlumnos = aulas.values();
		int contador=1;
		
		for (List<Alumno> list : listasAlumnos) {
			System.out.println("En aula " +contador +" hay " +list.size() + " alumnos");
			contador++;
				for (Alumno alumno : list) {
					System.out.println("Alumno:" + alumno.getName()+ "\n\tDNI:"+alumno.getDni());
			
			
				}
		}

		List <Alumno> alumnosDeClase= aulas.get("1B");
		System.out.println("================\nEl colegio tiene " + aulas.size() + " aulas");
		System.out.println("En aula 1 hay " + alumnosDeClase.size()+ " alumnos");
		
		for (Alumno alumno : alumnosDeClase) {
			System.out.println("Alumno:" + alumno.getName()+ "\n\tDNI:"+alumno.getDni());
		}
	}
	

}
