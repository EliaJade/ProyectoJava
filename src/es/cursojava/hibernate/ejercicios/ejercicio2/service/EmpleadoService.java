package es.cursojava.hibernate.ejercicios.ejercicio2.service;

import es.cursojava.hibernate.ejercicios.ejercicio2.dao.EmpleadoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;

public class EmpleadoService {
	
	private EmpleadoDAOImpl empleadoDAO;
	
	public EmpleadoService(EmpleadoDAOImpl empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	
	public void altaEmpleado(EmpleadoDTOReq empleadoDTO) {
		if(empleadoDTO.getNif() == null || empleadoDTO.getNif().trim().isEmpty()) {
			throw new IllegalArgumentException("El nif no puede estar vacio");
		}
		Empleado empleadoExistente = (Empleado) empleadoDAO.buscarPorNif(empleadoDTO.getNif());
		if(empleadoExistente != null) {
			throw new IllegalArgumentException("Este nif ya pertenece a otro empleado, no puede haber duplicados");
		}
		
//		empleadoDAO.guardar(empleadoDTO);
	}

}
