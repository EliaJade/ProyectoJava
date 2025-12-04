package es.cursojava.hibernate.ejercicios.ejercicio2.service;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio2.dao.EmpleadoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.excepciones.ExcepcionDeNegocio;

public interface EmpleadoServiceInteface {
	public EmpleadoDTOReq altaEmpleado(EmpleadoDTOReq empleadoDTO)throws ExcepcionDeNegocio;
	public List<EmpleadoDTOReq> listarTodosEmpleados();
	public EmpleadoDTOReq actualizarSalario(String nif, double nuevoSalario)throws ExcepcionDeNegocio;
	public EmpleadoDTOReq buscarPorNif(String nif);
	public List<EmpleadoDTOReq> listarPorDepartamentos();
}
