package es.cursojava.inicio.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.objetos.Alumno;

public class Ejercicio1 {

	
	public static void main (String[]args) {
		Alumno alumno1 = new Alumno("juan", "111");

		Alumno alumno2 = new Alumno("muan", "222");
		Alumno alumno3 = new Alumno("luan", "333");
		Alumno alumno4 = new Alumno("fuan", "444");
		Alumno alumno5 = new Alumno("suan", "555");
		Alumno alumno6 = new Alumno("buan", "666");
		
		List<Alumno> listaAlumnos = new ArrayList();
		
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno4);
		
	}
}
