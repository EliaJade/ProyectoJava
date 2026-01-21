package es.cursojava.spring.beans.calculadora.beans;

import org.springframework.stereotype.Component;


public class Usuario {

	String nombre;
	Rol rol;
	public Usuario(String nombre, Rol rol) {
		super();
		this.nombre = nombre;
		this.rol = rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
