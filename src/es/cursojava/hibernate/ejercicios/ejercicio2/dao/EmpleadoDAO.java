package es.cursojava.hibernate.ejercicios.ejercicio2.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;

public interface EmpleadoDAO {

	 public Empleado buscarPorNif(String nif);
	 
	 public void guardar(Empleado empleado);
	 
	 public Empleado buscarPorId(Long id);
	 public List<Empleado> obtenerTodosEmpleados();
	 public List<Empleado> obtenerPorDepartamento(String departamento);
}
