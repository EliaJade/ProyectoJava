package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;



public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable, Insertable, Updatable{

	String fechaFabricacion;
	
	public ProductosElectronicos(String id, String nombre, int precio, String fechaFabricacion) {
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
