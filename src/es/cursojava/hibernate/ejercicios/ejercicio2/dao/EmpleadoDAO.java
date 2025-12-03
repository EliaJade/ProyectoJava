package es.cursojava.hibernate.ejercicios.ejercicio2.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio2.entities.Empleado;

public interface EmpleadoDAO {

	 List<Empleado> buscarPorNif(String nif);
}
