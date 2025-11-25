package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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

public class Main {
	    public static void main(String[] args) {
	    	insertarCursos();
	        
	    }
	    
	    public static void insertarCursos() {
	    	Curso curso1 = new Curso("123","Curso de Floristeria", "Aprender a cuidar flores y montar ramos", 150, true, Nivel.Basico, Categoria.Decoracion, 200, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13), LocalDateTime.of(2023, 11, 20, 14, 30));
            Curso curso2 = new Curso("456","Curso de Peluqueria", "Aprender a cuidar, cortar y decorar pelo", 150, true, Nivel.Avanzado, Categoria.Belleza,  150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13), LocalDateTime.of(2023, 11, 20, 14, 30));
            List<Curso> cursos = new CopyOnWriteArrayList<Curso>();
            System.out.println("Instertando " + cursos.size()+ " cursos");
            cursos.add(curso2);
            cursos.add(curso1);
            CursoDAO dao = new CursoDAO(); //creates a new session and transaction
            
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
	    
	    
	
}
