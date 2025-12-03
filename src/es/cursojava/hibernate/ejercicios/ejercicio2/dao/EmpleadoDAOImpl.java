package es.cursojava.hibernate.ejercicios.ejercicio2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;

public class EmpleadoDAOImpl implements EmpleadoDAO{
	
	private Session session;
	private Transaction transaction;
	
	public EmpleadoDAOImpl(Session session, Transaction transaction) {
		super();
		this.session = session;
		this.transaction = transaction;
	}
	
	
	@Override
	public List<Empleado> buscarPorNif(String nif) {
		System.out.println("Buscando empleado con el nif: " + nif);
		Query<Empleado> query = session.createQuery("from empleado where nif = :nif", Empleado.class);
		query.setParameter("nif", nif);
		return query.list();
	}



	

}
