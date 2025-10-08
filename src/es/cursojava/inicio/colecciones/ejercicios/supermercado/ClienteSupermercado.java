package es.cursojava.inicio.colecciones.ejercicios.supermercado;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Producto;

public class ClienteSupermercado{

	
	String nombre;
	List<Alimentos> carritoCompra= new ArrayList();
	
	//constructor
	public ClienteSupermercado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//get&set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Alimentos> getCarritoCompra() {
		return carritoCompra;
	}
	public void setCarritoCompra(List<Alimentos> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	
	//metodos
	public int elegirProducto() {
		System.out.println("Introduce el numero del producto que desea añadir a tu cesta, si no quiere añadir nada a su cesta pon 0");

		Scanner scan = new Scanner (System.in);
		int numeroSeleccionado = scan.nextInt();
		return numeroSeleccionado;
		
		
		
	}
	
	public int elegirCantidad() {
		System.out.println("Introduce la cantidad del producto que desea añadir a tu cesta");

		Scanner scan = new Scanner (System.in);
		int cantidadSeleccionado = scan.nextInt();
		return cantidadSeleccionado;
	}
	
	public void comprar(int productoElegido, int cantidadElegido, List<List<Alimentos>> alimentosLista ) {
		double totalPrecio =0;
		for (List<Alimentos> alimentos : alimentosLista) {
			for (Alimentos alimento : alimentos) {
				if(productoElegido==alimento.getId()) {
					totalPrecio = alimento.getPrecio() * cantidadElegido;
					System.out.println("Has elegido " + cantidadElegido + " " + alimento.getNombre() + "\nSu total quedaria en " + totalPrecio );
				
				}
			}
		}
//		totalPrecio = ((Producto) alimentosLista.get(productoElegido)).getPrecio() + totalPrecio;
//		System.out.println("Has elegido " + cantidadElegido + " " + alimentosLista.get(productoElegido) + "\nSu total quedaria en " + totalPrecio );
	}
	
	
}
