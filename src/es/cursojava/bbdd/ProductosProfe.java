package es.cursojava.bbdd;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductosProfe {
	
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fecha_alta;
	private String estado;
	private String sku;
	private String creado_por;
	private int iva;
	
	
	public ProductosProfe(int id, String nombre, String categoria, double precio, int stock, Date fecha_alta, String estado,
			String sku, String creado_por, int iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.estado = estado;
		this.sku = sku;
		this.creado_por = creado_por;
		this.iva = iva;
	}

	
	
}
