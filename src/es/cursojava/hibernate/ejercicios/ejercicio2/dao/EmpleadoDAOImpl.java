package es.cursojava.hibernate.ejercicios.ejercicio2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
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
		List<Empleado> results = query.getResultList();
        return results.isEmpty() ? null : results.get(0); 
	}

	@Override
	public void guardar(Empleado empleado) {
		session.persist(empleado);
	}

	public void commitTransaction() {
		transaction.commit();
		transaction = session.beginTransaction();
	}

	@Override
	public List<Empleado> obtenerPorDepartamento(String departamento){
		 Departamento depEnum;
		    try {
		        depEnum = Departamento.valueOf(departamento.toUpperCase()); // convierte "IT" → Departamento.IT
		    } catch (IllegalArgumentException e) {
		        System.out.println("Departamento no válido: " + departamento);
		        return new ArrayList<>();
		    }
		System.out.println("Buscando empleados del departamento "+ departamento);
		Query<Empleado> query = session.createQuery("from Empleado where departamento = :departamento", Empleado.class);
		query.setParameter("departamento", depEnum);
		return query.list();
		
	}

	@Override
	public List<Empleado> obtenerTodosEmpleados() {
		
		return session.createQuery("from Empleado", Empleado.class).list();
	}


	@Override
	public Empleado buscarPorId(Long id) {
		
		 return session.get(Empleado.class, id);
	}






	

}
