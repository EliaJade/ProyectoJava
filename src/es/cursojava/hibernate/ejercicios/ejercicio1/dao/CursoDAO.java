package es.cursojava.hibernate.ejercicios.ejercicio1.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Nivel;
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
		return session.get(Curso.class, id); //haciendo una query, es decir una constulta por primary key de la tabla curso.class(entity) y el primary key es el id
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		
		
		return session.createQuery("from Curso", Curso.class).list();
		
	}
	
	public List<Curso> obtenerCursoByNombre(String nombre) {
		if(nombre==null||nombre.trim().isEmpty()) {
			return obtenerTodosLosCursos();
		}
		Query<Curso> query=session.createQuery("from Curso where nombre like :nombreParam", Curso.class);
		query.setParameter("nombreParam", "%"+nombre.trim()+"%");

		
		return query.list();
		
	}
	
	public List<Curso> obtenerCursosPorCodigo(String codigo){
		Query<Curso> query = session.createQuery("from Curso where codigo like :codigoParam", Curso.class );
		query.setParameter("codigoParam", "%"+codigo.trim()+"%");
		
		return query.list();
	}

	public void commitTransaction() {
		transaction.commit();
	}

	public List<Curso> buscarPorRangoFechaInicio(LocalDate fechaDesde, LocalDate fechaHasta) {
		System.out.println("Buscando cursos desde " + fechaDesde + " hasta " + fechaHasta);
		
		Query<Curso> query = session.createQuery("from Curso where fechaInicio >= :desdeFecha and fechaInicio <= :hastaFecha", Curso.class);
		query.setParameter("desdeFecha", fechaDesde);
		query.setParameter("hastaFecha", fechaHasta);
		return query.list();
	}

	public List<Curso> buscarPorCategoriaYFechaInicio(Categoria categoria, LocalDate fechaDesde, LocalDate fechaHasta) {
		System.out.println("Buscando cursos desde " + fechaDesde + " hasta " + fechaHasta +" de la categoria " + categoria);
		
		Query<Curso> query = session.createQuery("from Curso where fechaInicio between :fechaDesde and :fechaHasta and categoria = :programacion", Curso.class);
		query.setParameter("fechaDesde", fechaDesde);
		query.setParameter("fechaHasta", fechaHasta);
		query.setParameter("programacion", categoria);
		return query.list();
	}

	public List<Curso> buscarPorNivelHorasYFecha(LocalDate fechaDesde, Nivel nivel, int horas) {
		

		System.out.println("Buscando cursos desde " + fechaDesde + " de nivel " + nivel +" con al menos " + horas + " horas");
		
		Query<Curso> query = session.createQuery("from Curso where fechaInicio >= :fechaDesde and nivel = :nivel and horasTotales >= :horas", Curso.class);
		query.setParameter("horas", horas);
		query.setParameter("nivel", nivel);
		query.setParameter("fechaDesde", fechaDesde);
		return query.list();
	}
}
