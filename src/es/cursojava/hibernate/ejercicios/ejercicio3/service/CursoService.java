package es.cursojava.hibernate.ejercicios.ejercicio3.service;


import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Nivel;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
import es.cursojava.hibernate.ejercicios.ejercicio2.excepciones.ExcepcionDeNegocio;
import es.cursojava.hibernate.ejercicios.ejercicio3.daos.AulaDAO;
import es.cursojava.hibernate.ejercicios.ejercicio3.daos.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.CursoRequestDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.CursoResponseDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Curso;
import es.cursojava.hibernate.utilidades.UtilidadesHibernate;

public class CursoService {
	
	
	public CursoResponseDTO altaCurso(CursoRequestDTO dto) {
		validarCurso(dto);
		
		Session session = UtilidadesHibernate.getSessionFactory();
		Transaction tx = null;
		try {
			if(!session.getTransaction().isActive()){
				tx = session.beginTransaction();
				
			}else {
				tx = session.getTransaction();	
			}

			//Insertar curso
			CursoDAO dao = new CursoDAO(session);
			Curso curso = mapToEntity(dto);

			dao.guardarCurso(curso);
			
			if(tx.isActive()) {
				tx.commit();

			}

			return mapToDTO(curso);
		} catch(Exception e){
			if(tx != null && tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} 
	}
	
	public CursoResponseDTO obtenerCursoPorId(Long id) {
		Session session = UtilidadesHibernate.getSessionFactory();
		
			CursoDAO dao = new CursoDAO(session);
			Curso curso = dao.obtenerCursoById(id);
			return mapToDTO(curso);
		
		
	}
	
	public CursoResponseDTO crearCursoConAula(CursoRequestDTO cursoDTO, AulaDTO aulaDTO) {
		
		validarAula(aulaDTO);
		validarCurso(cursoDTO);
		
		Session session = UtilidadesHibernate.getSessionFactory();
		Transaction tx = null;
		
		try {
			if(!session.getTransaction().isActive()) {
				tx = session.beginTransaction();
			} else {
				tx = session.getTransaction();
			}
			CursoDAO dao = new CursoDAO(session);

			Curso curso = mapToEntity(cursoDTO);
			Aula aula = mapToEntity(aulaDTO);
			curso.setAula(aula);
			
			dao.guardarCurso(curso);
			tx.commit();
			return mapToDTO(curso);
		} catch(Exception e) {
			if(tx != null && tx.isActive()){
				tx.rollback();
			}
			throw e;
		}
		
	}
	
	public void asignarAula(Long cursoId, Long aulaId) {
		Session session = UtilidadesHibernate.getSessionFactory();
		Transaction tx = null;
		
		try {
			if(!session.getTransaction().isActive()) {
				tx = session.beginTransaction();
			} else {
				tx = session.getTransaction();
			}
			CursoDAO dao = new CursoDAO(session);
			AulaDAO aulaDAO = new AulaDAO(session);
			Aula aula = aulaDAO.obtenerAulaById(aulaId);
			Curso curso = dao.obtenerCursoById(cursoId);
			if (curso == null) {
                throw new IllegalArgumentException("No se ha encontrado un curso con el id " + cursoId);
            }
			if(aula==null) {
				throw new IllegalArgumentException("No se ha encontrado una aula con el id "+ aulaId);
			}
			if(dao.existsCursoWithAula(aulaId)) {
				throw new IllegalArgumentException("La aula "+aulaId+" ya tiene un curso asignado");
			}
			
			dao.asignarAula(cursoId, aula);
			
			tx.commit();
		} catch (Exception e) {
			if(tx != null && tx.isActive()){
				tx.rollback();
			}
			throw e;
		}
		
	}
	
	
	
	//-------------Maps-----------------
	private Aula mapToEntity(AulaDTO dto) {
		if(dto == null) {
			return null;
		}
		Aula aula = new Aula(dto.codigo(), dto.capacidad(), dto.ubicacion());
		return aula;
	}

	private Curso mapToEntity(CursoRequestDTO dto) {
		if(dto== null) {
		return null;
		}
		Curso curso = new Curso(
				dto.codigo(), 
				dto.nombre(), 
				dto.description(), 
				dto.horasTotales(), 
				dto.activo(), 
				Nivel.valueOf(dto.nivel().toUpperCase()), 
				Categoria.valueOf(dto.categoria().toUpperCase()), 
				dto.precio(), 
				dto.fechaInicio(), 
				dto.fechaFin(), 
				dto.fechaCreacion());
		return curso;
	}
	
	private CursoResponseDTO mapToDTO(Curso curso) {
	    if(curso == null) return null;
	    return new CursoResponseDTO(
	        curso.getId(),
	        curso.getCodigo(),
	        curso.getNombre(),
	        curso.getDescription(),
	        curso.getHorasTotales(),
	        curso.isActivo(),
	        curso.getNivel().name(),
	        curso.getCategoria().name(),
	        curso.getPrecio(),
	        curso.getFechaInicio(),
	        curso.getFechaFin(),
	        curso.getFechaCreacion(),
	        curso.getAula() != null ? mapToDTO(curso.getAula()) : null
	    );
	}
	private AulaDTO mapToDTO(Aula aula) {
	    if(aula == null) return null;
	    return new AulaDTO(
	    	aula.getId(),
	    	aula.getCodigoAula(),
	    	aula.getCapacidad(),
	    	aula.getUbicacion()
	    );
	}

	//-------------Validaciones-----------------
	private void validarAula(AulaDTO aulaDTO) {
		if (aulaDTO.capacidad() == null || aulaDTO.capacidad() <= 0) {
			throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0");
			
		}
		if(aulaDTO.codigo() == null || aulaDTO.codigo().isEmpty() || aulaDTO.codigo().length() > 20) {
			throw new IllegalArgumentException("El código del aula no puede estar vacío");
			
		}
		
	}
	private void validarCurso(CursoRequestDTO dto) {
		//Validar curso
				if(dto.codigo() == null || dto.codigo().isEmpty() || dto.codigo().length() >20) {
					throw new IllegalArgumentException("El codigo del curso es obligatorio, no puede estar vacio y debe tener menos de 20 caracteres");
				}
				if(dto.nivel() == null) {
					throw new IllegalArgumentException("\"Departamento invalido. Solo puede ser de: " + Nivel.AVANZADO + ", "+ Nivel.INTERMEDIO +", "+ Nivel.BASICO);
				} 
					else {
		            try {
		                Nivel.valueOf(dto.nivel().toUpperCase());
		            } catch (IllegalArgumentException e) {
		                throw new IllegalArgumentException("Nivel inválido: " + dto.nivel());
		            }
		        }
				if(dto.categoria() == null) {
					throw new IllegalArgumentException("\"Departamento invalido. Solo puede ser de: " + Arrays.toString(Nivel.values()));
				}
				else {
		            try {
		                Categoria.valueOf(dto.categoria().toUpperCase());
		            } catch (IllegalArgumentException e) {
		                throw new IllegalArgumentException("Categoría inválida: " + dto.categoria());
		            }
		        }
				if (dto.precio() < 0) {
		            throw new IllegalArgumentException("El precio no puede ser negativo");
		        }

		        if (dto.fechaInicio() != null && dto.fechaFin() != null &&
		            dto.fechaInicio().isAfter(dto.fechaFin())) {
		            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de fin");
		        }
		    
	}
	

}
