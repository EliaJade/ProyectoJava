package es.cursojava.hibernate.ejercicios.ejercicio2.service;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio2.dao.EmpleadoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
import es.cursojava.hibernate.ejercicios.ejercicio2.excepciones.ExcepcionDeNegocio;

public class EmpleadoService implements EmpleadoServiceInteface{
	
	private EmpleadoDAOImpl empleadoDAO;
	final int SALARIO_MINIMO = 1000;
	
	
	public EmpleadoService() {
		this.empleadoDAO = empleadoDAO;
	}
	
	@Override
	public EmpleadoDTOReq altaEmpleado(EmpleadoDTOReq empleadoDTO) throws ExcepcionDeNegocio {
		empleadoDAO = new EmpleadoDAOImpl();
		if(empleadoDTO.getNif() == null || empleadoDTO.getNif().trim().isEmpty()) {
			throw new ExcepcionDeNegocio("El nif no puede estar vacio");
		}
		Empleado empleadoExistente = (Empleado) empleadoDAO.buscarPorNif(empleadoDTO.getNif());
		if(empleadoExistente != null) {
			throw new ExcepcionDeNegocio("Este nif ya pertenece a otro empleado, no puede haber duplicados");
		}
		if(empleadoDTO.getNombre() == null || empleadoDTO.getNombre().trim().isEmpty()) {
			throw new ExcepcionDeNegocio("El nombre no puede estar vacio");
		}
		
		
		if(empleadoDTO.getDepartamento() == null) {
			throw new ExcepcionDeNegocio("\"Departamento invalido. Solo puede ser de: " + Departamento.IT + ", "+ Departamento.FINANZAS +", "+ Departamento.RRHH +", "+ Departamento.VENTAS);
		}
		
		if(empleadoDTO.getSalario() < 0) {
			throw new ExcepcionDeNegocio("El salario del empleado no puede ser negativo");
		}
		if(empleadoDTO.getSalario() <= SALARIO_MINIMO) {
			throw new ExcepcionDeNegocio("El salario del empleado debe superar el minimo de 1000");
		}
		Empleado empleado = new Empleado(empleadoDTO.getNif(), empleadoDTO.getNombre(), empleadoDTO.getDepartamento(), empleadoDTO.getSalario());
		empleadoDAO.guardar(empleado);
		empleadoDAO.commitTransaction();
//		empleadoDTO.setId(empleado.getId());
		return empleadoDTO;
	}
	
	public List<EmpleadoDTOReq> listarTodosEmpleados() {
		EmpleadoDAOImpl dao = new EmpleadoDAOImpl();
		List<Empleado> empleados = dao.obtenerTodosEmpleados();
		List<EmpleadoDTOReq> empleadoDTO = new ArrayList();
		for (Empleado empleado : empleados) {
			EmpleadoDTOReq dto = new EmpleadoDTOReq();
			dto.setNif(empleado.getNif());
			dto.setNombre(empleado.getNombre());
			dto.setDepartamento(empleado.getDepartamento());
			dto.setSalario(empleado.getSalario());
			empleadoDTO.add(dto);
			
		}
		for (EmpleadoDTOReq empleadoDTOReq : empleadoDTO) {
			System.out.println( empleadoDTOReq.getNif()+" "+empleadoDTOReq.getNombre()+" "+ empleadoDTOReq.getDepartamento()+" "+ empleadoDTOReq.getSalario());
		}
		return empleadoDTO;
		
	}

	@Override
	public EmpleadoDTOReq actualizarSalario(String nif, double nuevoSalario) throws ExcepcionDeNegocio {
		if(nif == null||nif.trim().isBlank()) {
			throw new ExcepcionDeNegocio("El nif no puede estar vacio");
		}
		Empleado empleadoExistente = (Empleado) empleadoDAO.buscarPorNif(nif);
		if(empleadoExistente == null) {
			throw new ExcepcionDeNegocio("Este nif no pertenece a ningun empleado");
		}
		if(nuevoSalario <SALARIO_MINIMO ) {
			throw new ExcepcionDeNegocio("El nuevo salario del empleado no puede ser menor del minimo: 1000");
		}
		
		empleadoExistente.setSalario(nuevoSalario);
		empleadoDAO.guardar(empleadoExistente);
		empleadoDAO.commitTransaction();
		EmpleadoDTOReq dto = new EmpleadoDTOReq();
		dto.setNif(empleadoExistente.getNif());
		dto.setNombre(empleadoExistente.getNombre());
		dto.setDepartamento(empleadoExistente.getDepartamento());
		dto.setSalario(nuevoSalario);
		return dto;
	}

	@Override
	public EmpleadoDTOReq buscarPorNif(String nif) {
		EmpleadoDAOImpl dao = new EmpleadoDAOImpl();
		Empleado empleado = dao.buscarPorNif(nif);
		EmpleadoDTOReq dto = new EmpleadoDTOReq();
		System.out.println("");
		dto.setNif(empleado.getNif());
		dto.setNombre(empleado.getNif());
		dto.setDepartamento(empleado.getDepartamento());
		dto.setSalario(empleado.getSalario());
		System.out.println(dto.getNif()+ " "+ dto.getNombre()+ " "+ dto.getDepartamento()+ " "+dto.getSalario());
		return dto;
	}

	@Override
	public List<EmpleadoDTOReq> listarPorDepartamentos() {
		
		return null;
	}

}
