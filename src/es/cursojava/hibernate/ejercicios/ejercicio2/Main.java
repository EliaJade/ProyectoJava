package es.cursojava.hibernate.ejercicios.ejercicio2;

import java.util.Locale.Category;

import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
import es.cursojava.hibernate.ejercicios.ejercicio2.excepciones.ExcepcionDeNegocio;
import es.cursojava.hibernate.ejercicios.ejercicio2.service.EmpleadoService;
import es.cursojava.hibernate.ejercicios.ejercicio2.service.EmpleadoServiceInteface;

public class Main {
	 public static void main(String[] args) {
	        System.out.println("=== INICIO DE LA APLICACIÓN DE GESTIÓN DE EMPLEADOS ===");
	        EmpleadoServiceInteface servicio = new EmpleadoService();
	        crearEmpleadoDTO(servicio, "1111", "Elia", Departamento.FINANZAS, 1600);
	        crearEmpleadoDTO(servicio, "2222", "Henry", Departamento.IT, 0);
	        servicio.listarTodosEmpleados();
	        
	        
	 }
	 
	 public static void crearEmpleadoDTO(EmpleadoServiceInteface servicio, String nif, String nombre, Departamento departamento, double salario) {
		 EmpleadoDTOReq nuevo= new EmpleadoDTOReq(nif, nombre, departamento, salario);
		 try {
			EmpleadoDTOReq creado = servicio.altaEmpleado(nuevo);
			
			System.out.println("Se ha creado un nuevo empleado");
		} catch (ExcepcionDeNegocio e) {
			System.out.println("Error de negocio: " + e.getMessage());
		}
	 }
}
