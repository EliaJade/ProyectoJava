package es.cursojava.inicio.maps.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.inicio.maps.ejercicios.ejercicio2.Colegio;
import es.cursojava.inicio.objetos.Alumno;
import es.cursojava.utilidades.SimUtils;

public class Main {
	
	public static void main(String[]args) {
		
		Map<Autor, List<Libro>> biblioteca = new HashMap();

		Libro libro1 = new Libro("Harry Potter", "isbn1", 1997);
		Libro libro2 = new Libro("Little Women", "isbn2", 1868);
		Libro libro3 = new Libro("1984", "isbn3", 1949);
		Libro libro4 = new Libro("Pride and Prejudice", "isbn4", 1813);
		Libro libro5 = new Libro("To Kill a Mockingbird", "isbn5", 1960);
		Libro libro6 = new Libro("The Book Theif", "isbn6", 2005);
		Libro libro7 = new Libro("The Lord of the Rings", "isbn7", 1937);
		Libro libro8 = new Libro("Don Quijote", "isbn8", 1605 );
		Libro libro9 = new Libro("Gulliver's Travels", "isbn9", 1726);
		
		
		Autor autor1 = new Autor("Jorge", "Español");
		Autor autor2 = new Autor("Kai", "Holandes");
		Autor autor3 = new Autor("Eilidh", "Escoces");
		Autor autor4 = new Autor("Akello", "Ugandesa");
		List<Libro> libros =Arrays.asList(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9);
		
		biblioteca.put(autor1 ,libros.subList(0, 3));
		biblioteca.put(autor2, libros.subList(3, 6));
		biblioteca.put(autor3, libros.subList(6, 7));
		biblioteca.put(autor4, libros.subList(7, 9));
		
		
		
		
		
		
		
		
		
		
		//mostrar las nacionalidades de los autores
		Collection<Autor> listAutor = biblioteca.keySet();
			for (Autor autor : listAutor) {
				System.out.println(autor.getNacionalidad());
			}
			
			
			
			
			
			
			
			
			
		//mostrar el título de todos los libros publicados después del 2010
		System.out.println("===================\nThese books were published after 1900:");
			for (Libro libro : libros) {

				if(libro.getAnios()>=1900) {
					System.out.println(libro.getTitulo());
					
				}
				
			}
			
					
			
			
			
			
		// mostrar por cada autor que tenga más de dos libros su nombre y el nombre de todos los libros que tiene publicados
		Set<Entry<Autor, List<Libro>>> listasLibros = biblioteca.entrySet();
				for (Entry<Autor, List<Libro>> list : listasLibros) {
					if(list.getValue().size()>=2) {
						System.out.println("==================\nEl autor " + list.getKey().getNombre() +" tiene " +list.getValue().size() + " books");
						
						for (Libro libro : list.getValue()) {
//	
							System.out.println(libro.getTitulo());
						}
					}
						
							
				
			}
			
			
		// Solicitar los datos de un libro, autor, titulo, isbn y año de publicación, 
			//- si el autor no está en la biblioteca, solicitar la nacionalidad del autor y meterlo en la biblioteca, 
			//- si el autor sí está ya, agregar el libro a su listado
			
			String libroDeseado = SimUtils.pideDatoCadena("Dime el titulo del libro");
			for (Entry<Autor, List<Libro>> list : listasLibros) {
				for (Libro libro : list.getValue()) {
					if(libroDeseado==libro.getTitulo()) {
						
					}
				}
			}
			String autorDeseado = SimUtils.pideDatoCadena("Dime el autor del libro");
			
			for (Autor autor : listAutor) {
				if(autorDeseado==autor.getNombre()) {
						
					
				}
			}
//
//				
	}
			
			
	

}
