package es.cursojava.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateMain {
    public static void main(String[] args) {

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println("Conectado");
            
            Transaction tx = session.beginTransaction();
            
            Empresa empresa1 = new Empresa("Tienda de Jamones", "S.A.", "123", "Venta Jabones", null);
            Empresa empresa2 = new Empresa("Tienda de Salmon", "S.A.", "124", "Venta Flores", null);
              
            session.persist(empresa2);
            session.persist(empresa1);
            
            tx.commit();
            
            Query<Empresa> query = session.createQuery("from Empresa", Empresa.class); //hql
            List<Empresa> empresas = query.list();
            //or List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list(); //hql
           
            for (Empresa empresa : empresas) {
				System.out.println(empresa.toString());
			}
            
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}

