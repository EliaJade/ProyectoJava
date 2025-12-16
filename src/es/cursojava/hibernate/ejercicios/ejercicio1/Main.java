package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import es.cursojava.hibernate.Empresa;
import es.cursojava.hibernate.ejercicios.ejercicio1.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Nivel;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;
import es.cursojava.utilidades.SimUtils;
import oracle.jdbc.driver.parser.util.Array;

public class Main {
	public static void main(String[] args) {
		insertarCursos();
		listarCursos();
//		obtenerCursoPorId();
//		mostrarCursosPorNombre();
//		mostrarCursoPorCodigo();
		filtrarPorFechas();
		filtrarPorCategoriaYFechas();
		filtrarPorNivelHorasYFecha();
		
	}

	public static void insertarCursos() {
		Curso curso1 = new Curso("123", "Curso de Floristeria", "Aprender a cuidar flores y montar ramos", 150, true,
				Nivel.BASICO, Categoria.DECORACION, 200, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		Curso curso2 = new Curso("456", "Curso de Peluqueria", "Aprender a cuidar, cortar y decorar pelo", 150, true,
				Nivel.AVANZADO, Categoria.BELLEZA, 150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		
		List<Curso> cursos = new CopyOnWriteArrayList<Curso>();
		try {
			cursos.addAll(leerArchivo());
		} catch (IOException e) {
			e.printStackTrace();
		}
		cursos.add(curso2);
		cursos.add(curso1);

		System.out.println("Instertando " + cursos.size() + " cursos");
		CursoDAO dao = new CursoDAO(); // creates a new session and transaction

		for (Curso curso : cursos) {
			System.out.println("Insertando curso " + curso.getNombre());
			dao.guardarCurso(curso);
		}
		dao.commitTransaction(); // method created in cursoDAO to commit, in cnstr its initialized
	}

	public static void listarCursos() {
		System.out.println("Listando cursos");
		CursoDAO dao = new CursoDAO();
		List<Curso> cursos = dao.obtenerTodosLosCursos();
		for (Curso curso : cursos) {
			System.out.println("Curso: " + curso.getCodigo() + " - " + curso.getNombre());
		}
		dao.commitTransaction();

	}

	public static void obtenerCursoPorId() {
		int id = SimUtils.pideDatoNumerico("Introduce el id del curso");
		CursoDAO dao = new CursoDAO();
		Curso curso = dao.obtenerCursoById(id);
		if (curso != null) {
			System.out.println("Curso encontrado: " + curso.getCodigo() + " - " + curso.getNombre());
		} else {
			System.out.println("No se ha encontrado ningun curso con id: " + id);
		}
		dao.commitTransaction();
	}
	
	
		public static List<Curso> leerArchivo () throws IOException {
			String nombreArchivo = "./recursos/cursos.txt";
		
			File archivo = new File(nombreArchivo);


        	List<Curso> cursos = new CopyOnWriteArrayList<Curso>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

	        	String linea;
	        	int cont = 0;
	        	while((linea = reader.readLine())!= null) {
	        		
	        		String[] campos = linea.split("\\|");
	        		for (String string : campos) {
						System.out.println(string);
					}
	        		System.out.println(campos.length);
	        		//OTRA OPCION:
//	        		String codigo = campos[0];
//	        		String nombre = campos[1];
//    				String descrip = campos[2];
//    				int horasTot = Integer.parseInt(campos[3]);
//    				boolean activo = Boolean.parseBoolean(campos[4]);
//    				Nivel nivel = Nivel.valueOf(campos[5]);
//    				Categoria categoria = Categoria.valueOf(campos[6]);
//    				double precio = Double.parseDouble(campos[7]);
//    				LocalDate fechainicio = LocalDate.parse(campos[8]);
//    				LocalDate fechafin = LocalDate.parse(campos[9]);
//    				Curso curso1 = new Curso(codigo,nombre,descrip,horasTot,activo,nivel,categoria,precio,fechainicio,fechafin,LocalDateTime.now());
	        		Curso curso = new Curso (
	        				campos[0],
	        				campos[1],
	        				campos[2],
	        				Integer.parseInt(campos[3]),
	        				Boolean.parseBoolean(campos[4]),
	        				Nivel.valueOf(campos[5]),
	        				Categoria.valueOf(campos[6]),
	        				Double.parseDouble(campos[7]),
	        				LocalDate.parse(campos[8]),
	        				LocalDate.parse(campos[9]),
	        				LocalDateTime.now()
	        				);
	        		cursos.add(curso);
	        		
	        	}
//	        		
			return cursos;
	        	
	            	
	   }
		}
		
		public static void mostrarCursosPorNombre() {
			String nombre = SimUtils.pideDatoCadena("Dime un nombre de un curso");
			CursoDAO dao = new CursoDAO();
			List<Curso> cursos = dao.obtenerCursoByNombre(nombre);
			if (cursos.isEmpty()) {
				List<Curso> cursosTodos = dao.obtenerTodosLosCursos();
				System.out.println("There was no course called " + nombre + " found");
				
				for (Curso curso : cursosTodos) {
					System.out.println("Curso encontrado: " + curso.getCodigo() + " - " + curso.getNombre() );
					
				}
			}
			for (Curso curso : cursos) {
				System.out.println("Curso encontrado: " + curso.getCodigo() + " - " + curso.getNombre() );
				
			}
			dao.commitTransaction();
		}
		
		
		public static void mostrarCursoPorCodigo() {
			String codigo = SimUtils.pideDatoCadena("Dime un codigo de un curso");
			CursoDAO dao = new CursoDAO();
			List<Curso> cursos = dao.obtenerCursosPorCodigo(codigo);
			for (Curso curso : cursos) {
				System.out.println("Curso encontrado: " + curso.getCodigo() + " - " + curso.getNombre() );
				}
		}
		
		public static void filtrarPorFechas() {
			CursoDAO dao = new CursoDAO();
			
			LocalDate fechaDesde = LocalDate.of(2025, 1, 2);
			LocalDate fechaHasta = LocalDate.of(2025, 2, 1);
			
			List<Curso> cursos = dao.buscarPorRangoFechaInicio(fechaDesde, fechaHasta);
			System.out.println("Cursos con fecha de inicio entre " + fechaDesde + " y "+ fechaHasta + ":");
			cursos.forEach(System.out::println);
			dao.commitTransaction();
		}
	        
		public static void filtrarPorCategoriaYFechas() {
			CursoDAO dao = new CursoDAO();
			
			LocalDate fechaDesde = LocalDate.of(2025, 1, 2);
			LocalDate fechaHasta = LocalDate.of(2025, 2, 1);
			Categoria categoria = Categoria.PROGRAMACIÓN;
			
			List<Curso> cursos = dao.buscarPorCategoriaYFechaInicio(categoria, fechaDesde, fechaHasta);
			cursos.forEach(curso -> System.out.println(curso));
			dao.commitTransaction();
		}
		
		public static void filtrarPorNivelHorasYFecha() {
			CursoDAO dao = new CursoDAO();
			LocalDate fechaDesde = LocalDate.of(2024, 1, 2);
			Nivel nivel = Nivel.BASICO;
			int horas =20;
			
			List<Curso> cursos = dao.buscarPorNivelHorasYFecha(fechaDesde, nivel, horas);
			cursos.forEach(curso -> System.out.println(curso));
			
		}

}
