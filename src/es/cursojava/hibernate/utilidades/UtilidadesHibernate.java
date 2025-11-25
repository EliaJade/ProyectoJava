package es.cursojava.hibernate.utilidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Nivel;

public class UtilidadesHibernate {
	private static Session session;
//		private static final SessionFactory sessionFactory = new Configuration() 
//				.configure() 
//				.buildSessionFactory(); 
//		public static Session getSession() { 
//			return sessionFactory.openSession();
//			} 
//		}
	//BETTER MORE OPTIMIZED VERSION ABOVE

	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration() //CREATES A SESSIO FACTORY EVERY TIME
				.configure()
				.buildSessionFactory();
		 Session session = sessionFactory.openSession();
		return session;
		
	}
	public static Session getSessionFactory() {
		if (session == null || !session.isOpen()) {
			session = getSession();
		}
		return session;
	}
}
