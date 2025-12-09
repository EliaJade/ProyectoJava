package es.cursojava.hibernate.ejercicios.ejercicio2;

import java.util.Locale.Category;

import es.cursojava.hibernate.ejercicios.ejercicio1.enums.Categoria;
import es.cursojava.hibernate.ejercicios.ejercicio2.dto.EmpleadoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
import es.cursojava.hibernate.ejercicios.ejercicio2.excepciones.ExcepcionDeNegocio;
import es.cursojava.hibernate.ejercicios.ejercicio2.service.EmpleadoService;
import es.cursojava.hibernate.ejercicios.ejercicio2.service.EmpleadoServiceInteface;
import es.cursojava.utilidades.SimUtils;

public class Main {
	 public static void main(String[] args) {
	        System.out.println("=== INICIO DE LA APLICACIÓN DE GESTIÓN DE EMPLEADOS ===");
	        EmpleadoServiceInteface servicio = new EmpleadoService();
	        EmpleadoDTOReq empleado1 = crearEmpleadoDTO(servicio, "1111", "Elia", Departamento.FINANZAS, 1600);
	        EmpleadoDTOReq empleado2 = crearEmpleadoDTO(servicio, "2222", "Henry", Departamento.IT, 0);

	        EmpleadoDTOReq empleado3 = crearEmpleadoDTO(servicio, "3333", "Sam", Departamento.IT, 1001);

	        EmpleadoDTOReq empleado4 = crearEmpleadoDTO(servicio, "4444", "Joel", Departamento.IT, 2000);
	        
	        servicio.listarTodosEmpleados();
	        servicio.buscarPorNif(SimUtils.pideDatoCadena("Dime el nif del empleado que buscas"));
	        try {
				servicio.actualizarSalario("3333", 3000);
			} catch (ExcepcionDeNegocio e) {
				e.getMessage();
			}
	        servicio.listarPorDepartamentos(SimUtils.pideDatoCadena("Dime el departamento que deseas ver"));
	        
	 }
	 
	 public static EmpleadoDTOReq crearEmpleadoDTO(EmpleadoServiceInteface servicio, String nif, String nombre, Departamento departamento, double salario) {
		 EmpleadoDTOReq nuevo= new EmpleadoDTOReq(nif, nombre, departamento, salario);
		 try {
			EmpleadoDTOReq creado = servicio.altaEmpleado(nuevo);
			
			System.out.println("Se ha creado un nuevo empleado");
		} catch (ExcepcionDeNegocio e) {
			System.out.println("Error de negocio: " + e.getMessage());
		}
		 return nuevo;
	 }
}
