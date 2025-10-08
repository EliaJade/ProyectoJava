package es.cursojava.inicio.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.objetos.Alumno;

public class Ejercicio1 {

	
	public static void main (String[]args) {
		Alumno alumno1 = new Alumno("juan", "111", 7.8);

		Alumno alumno2 = new Alumno("muan", "222", 9.20);
		Alumno alumno3 = new Alumno("luan", "333", 8);
		Alumno alumno4 = new Alumno("juan", "444", 5);
		Alumno alumno5 = new Alumno("suan", "555", 4);
		Alumno alumno6 = new Alumno("buan", "666", 10);
		
		List<Alumno> listaAlumnos = new ArrayList();
		
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno4);
		
		mostrarInfoAlumnos(listaAlumnos);
//		mostrarAlumnoYNota(listaAlumnos);
//		mediaAlumnoMismoNombre(listaAlumnos, "juan");
		borrarAlumnosSuspenos(listaAlumnos);

		mostrarInfoAlumnos(listaAlumnos);
	}
	
	public static void mostrarInfoAlumnos(List<Alumno> listaAlumnos) {
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno.getName()+": " + alumno.getNotaMedia());
		}
	}
	
	public static void mostrarAlumnoYNota(List<Alumno> listaAlumnos) {
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getNotaMedia()>=9) {
				System.out.println(alumno.getName() +": " + alumno.getNotaMedia());
				
			}
		}
	}
	
	public static void mediaAlumnoMismoNombre(List<Alumno> listaAlumnos, String alumnoPedido) {
		double mediaTotalMismoAlumno= 0;
		int contadorAlumnosNombreIgual = 0;
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getName().equals(alumnoPedido)) {
				System.out.println(alumno.getName() +": " + alumno.getNotaMedia());
				mediaTotalMismoAlumno= mediaTotalMismoAlumno + alumno.getNotaMedia();
				contadorAlumnosNombreIgual++;
			}
		}mediaTotalMismoAlumno= mediaTotalMismoAlumno/contadorAlumnosNombreIgual;
		System.out.println("La media de los alumnos con el nombre "+ alumnoPedido + " es " + mediaTotalMismoAlumno);
		
	}
	public static void borrarAlumnosSuspenos(List<Alumno> listaAlumnos) {
		int contadorAlumno= 0;
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getNotaMedia()<5) {
				System.out.println(alumno.getName() +": " + alumno.getNotaMedia() + " removed");
				listaAlumnos.remove(contadorAlumno);
//				listaAlumnos.remove(alumno); //They do the same thing
			}
			contadorAlumno++;
		}
	}
	
}
