package es.cursojava.hibernate.ejercicios.ejercicio3.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.ejercicio3.daos.AulaDAO;
import es.cursojava.hibernate.ejercicios.ejercicio3.daos.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Curso;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;

public class AulaService {

	public void altaAula(AulaDTO dto) {
			validarAula(dto);
		
		Session session = UtilidadesHibernate.getSessionFactory();
		Transaction tx = null;
		try {
			if(!session.getTransaction().isActive()){
				tx = session.beginTransaction();
				
			}else {
				tx = session.getTransaction();	
			}
	
			//Insertar curso
			AulaDAO dao = new AulaDAO(session);
			Aula aula = mapToEntity(dto);
	
			dao.guardarAula(aula);
			
			if(tx.isActive()) {
				tx.commit();
			}
		} catch(Exception e){
			if(tx != null && tx.isActive()) {
				tx.rollback();
			}
			throw e;
		}
	
			
	}

	private Aula mapToEntity(AulaDTO dto) {
		if(dto == null) {
			return null;
		}
		Aula aula = new Aula(dto.codigo(), dto.capacidad(), dto.ubicacion());
		return aula;
	}
	

	private void validarAula(AulaDTO dto) {
		if (dto.codigo() == null || dto.codigo().isEmpty()) {
            throw new IllegalArgumentException("El número del aula no puede estar vacío");
        }
        if (dto.capacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0");
        }
    }
	

}
