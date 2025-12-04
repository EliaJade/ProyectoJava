package es.cursojava.hibernate.ejercicios.ejercicio2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;

public class EmpleadoDAOImpl implements EmpleadoDAO{
	
	private Session session;
	private Transaction transaction;
	
	public EmpleadoDAOImpl() {
		
		session = UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
	
	@Override
	public Empleado buscarPorNif(String nif) {
		System.out.println("Buscando empleado con el nif: " + nif);
		Query<Empleado> query = session.createQuery("from Empleado where nif = :nif", Empleado.class);
		query.setParameter("nif", nif);
		return query.getSingleResult();
	}

	@Override
	public void guardar(Empleado empleado) {
		session.persist(empleado);
	}

	public void commitTransaction() {
		transaction.commit();
	}


	public List<Empleado> obtenerTodosEmpleados() {
		
		return session.createQuery("from Empleado", Empleado.class).list();
	}






	

}
