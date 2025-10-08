package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

//import java.util.ArrayList;
//import java.util.List;
//
//import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Manzana;
//import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Pimiento;
//import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Platano;

public abstract class Alimentos extends Producto{
	
	String fechaCaducidad;

	int cantidad;
	

	public Alimentos(int id, String nombre, double precio, String fechaCaducidad) {
		super(id, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		
	}


	public Alimentos(int id, String nombre, double precio, int cantidad) {
		super(id, nombre, precio);
		this.cantidad=cantidad;
		}





	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
