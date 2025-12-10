package es.cursojava.hibernate.ejercicios.ejercicio3.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.utilidades.UtilidadesHibernate;


public class AulaDAO {
	
	private Session session;
	private Transaction transaction;
	
	public AulaDAO() {
		session=UtilidadesHibernate.getSessionFactory();
		transaction= session.beginTransaction();
	}

}
