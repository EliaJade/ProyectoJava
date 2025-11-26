package es.cursojava.hibernate.ejercicios.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;

public class CursoDAO {
	
	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
		session=UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso() {
		
	}
	
	public void actualizarCurso() {
		
	}
	
	public Curso obtenerCursoById(int id) {
		return session.get(Curso.class, id); //haciendo una query, es decir una constulta por primary key de la tabla curso.class(entity)
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		
		
		return session.createQuery("from Curso", Curso.class).list();
		
	}

	public void commitTransaction() {
		transaction.commit();
	}
}
