package es.cursojava.hibernate.ejercicios.ejercicio2.dto;

import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;

public class EmpleadoDTOReq {
	
	private String nif;
	private String nombre;
	private Departamento departamento;
	private double salario;
	
	public EmpleadoDTOReq(String nif, String nombre, Departamento departamento, double salario) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "EmpleadoDTOReq [nif=" + nif + ", nombre=" + nombre + ", departamento=" + departamento + ", salario="
				+ salario + "]";
	}
	
	
}
