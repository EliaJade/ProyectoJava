package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

public abstract class Alimentos extends Producto{
	
	String fechaCaducidad;

	public Alimentos(String id, String nombre, int precio, String fechaCaducidad) {
		super(id, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	

}
