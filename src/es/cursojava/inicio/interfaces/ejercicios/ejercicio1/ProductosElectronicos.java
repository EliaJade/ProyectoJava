package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Apagable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Encendible;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Insertable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Updatable;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable, Insertable, Updatable{

	String fechaFabricacion;
	
	public ProductosElectronicos(int id, String nombre, int precio, String fechaFabricacion) {
		super(id, nombre, precio);
		this.fechaFabricacion=fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	

	
	

}
