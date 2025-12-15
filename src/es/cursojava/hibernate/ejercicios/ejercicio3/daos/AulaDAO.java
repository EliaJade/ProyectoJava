package es.cursojava.hibernate.ejercicios.ejercicio3.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Aula;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;


public class AulaDAO {
	
	private Session session;
	private Transaction transaction;
	
	public AulaDAO(Session session) {
//		session=UtilidadesHibernate.getSessionFactory();
		this.session= session;
		
//		transaction= session.beginTransaction();
	}
	public void guardarAula(Aula aula) {
		session.persist(aula);
	}
	public Aula obtenerAulaById(Long aulaId) {
		return session.get(Aula.class, aulaId); //haciendo una query, es decir una constulta por primary key de la tabla curso.class(entity) y el primary key es el id
	}
	public List<Aula> obtenerTodosLasAulas() {
		return session.createQuery("from Aula", Aula.class).list();
		
	}
	public List<Aula> obtenerCursoByCodigo(String codigo) {
		if(codigo==null||codigo.trim().isEmpty()) {
			return obtenerTodosLasAulas();
		}
		Query<Aula> query=session.createQuery("from Aula where codigoAula like :codigo", Aula.class);
		query.setParameter("codigo", "%"+codigo.trim()+"%");

		
		return query.list();
		
	}
	public void commitTransaction() {
		transaction.commit();
	}
}
