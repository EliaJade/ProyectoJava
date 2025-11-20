package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import es.cursojava.hibernate.Empresa;

public class Main {
	    public static void main(String[] args) {

	        try {
	            SessionFactory sessionFactory = new Configuration()
	                    .configure() // Carga hibernate.cfg.xml
	                    .buildSessionFactory();
	            Session session = sessionFactory.openSession();
	            System.out.println("Conectado");
	            
//	            Transaction tx = session.beginTransaction();
//	            
//	            Curso curso1 = new Curso("123","Curso de Floristeria", "Aprender a cuidar flores y montar ramos", 150, true, Nivel.Basico, Categoria.Decoracion, 200, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13), LocalDateTime.of(2023, 11, 20, 14, 30));
//	            Curso curso2 = new Curso("456","Curso de Peluqueria", "Aprender a cuidar, cortar y decorar pelo", 150, true, Nivel.Avanzado, Categoria.Belleza,  150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13), LocalDateTime.of(2023, 11, 20, 14, 30));
//	                                                                                                                   
//	            session.persist(curso2);
//	            session.persist(curso1);
//	                            
//	            tx.commit();
	            
//	            Query<Empresa> query = session.createQuery("from Empresa", Empresa.class);
//	            List<Empresa> empresas = query.list();
	            //or List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();
	           
//	            for (Empresa empresa : empresas) {
//					System.out.println(empresa.toString());
//				}
	            
	        } catch (Throwable ex) {
	            System.err.println("Error al crear la SessionFactory." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	
}
