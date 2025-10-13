package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Producto;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Manzana;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Pimiento;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Platano;

public class Supermercado {

	private String nombre;
	private List<List<Alimentos>> alimentosLista = new CopyOnWriteArrayList();
	private List<ClienteSupermercado> clientes = new ArrayList();
	

	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
		this.clientes = clientes;
		this.alimentosLista=alimentosLista;
	}
	public Supermercado() {
		super();
		this.nombre = nombre;
		this.clientes = clientes;
		this.alimentosLista=alimentosLista;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<ClienteSupermercado> getClientes() {
		return clientes;
	}
	public void setClientes(List<ClienteSupermercado> clientes) {
		this.clientes = clientes;
	}
	public List<List<Alimentos>> getAlimentosLista() {
		return alimentosLista;
	}
	public void setAlimentosLista(List<List<Alimentos>> alimentosLista2) {
		this.alimentosLista = alimentosLista2;
	}
	
	
	
//	public static void main(String[]args) {
//		Supermercado supermercado1 = new Supermercado();
//		ClienteSupermercado cliente1 = new ClienteSupermercado("Samuel");
//		ClienteSupermercado cliente2 = new ClienteSupermercado("Natalia");
//		
//		
////		alimentosLista= ArrayList();
//		
//		List<Alimentos> platanosLista = supermercado1.crearPlatanoLista();
//		List<Alimentos> manzanaLista = supermercado1.crearManzanaLista();
//		List<Alimentos> pimientosLista = supermercado1.crearPimientoLista();
//
//		alimentosLista.add(platanosLista);
//
//		alimentosLista.add(manzanaLista);
//
//		alimentosLista.add(pimientosLista);
//		
//		int contadorDeAlimento = 1;
//		for (List<Alimentos> alimentos : alimentosLista) {
//			for (Alimentos alimento : alimentos) {
//				System.out.println(contadorDeAlimento + "." +alimento.getNombre() + ":\n\tCantidad disponible: " + alimento.getCantidad()+ "\n\tPrecio: " + alimento.getPrecio() + " euros");
//				contadorDeAlimento++;
//			}
//		}
//		System.out.println(alimentosLista.size());
////		int productoElegido = cliente1.elegirProducto();
////		int cantidadElegido = cliente1.elegirCantidad();
////		cliente1.comprar(productoElegido, cantidadElegido, alimentosLista);
//		cliente1.comprar(alimentosLista);
//		int contadorDeAlimento2 = 1;
//		for (List<Alimentos> alimentos : alimentosLista) {
//			for (Alimentos alimento : alimentos) {
//				System.out.println(contadorDeAlimento2 + "." +alimento.getNombre() + ":\n\tCantidad disponible: " + alimento.getCantidad()+ "\n\tPrecio: " + alimento.getPrecio() + " euros");
//				contadorDeAlimento2++;
//			}
//		}
//		cliente2.comprar(alimentosLista);
//	}
	
	//Metodos
	
	public void addClientes(ClienteSupermercado cliente) {
		this.clientes.add(cliente);
	}
	
	public List<Alimentos> crearPlatanoLista(){
		Alimentos platano1 = new Platano(1, "Platano Canario", 0.3, 20);
		Alimentos platano2 = new Platano(2, "Banana", 0.2, 10);

		List<Alimentos> platanosLista= new ArrayList();
		
		platanosLista.add((Platano)platano1);
		platanosLista.add((Platano)platano2);
		return platanosLista;
	}
	
	public List<Alimentos> crearManzanaLista(){
		Alimentos manzana1 = new Manzana(3, "Manzana Roja", 0.1, 30);
		Alimentos manzana2 = new Manzana(4, "Manzana Verde", 0.15, 20);

		List<Alimentos> manzanaLista= new ArrayList();
		
		manzanaLista.add((Manzana)manzana1);
		manzanaLista.add((Manzana)manzana2);
		return manzanaLista;
	}
	public List<Alimentos> crearPimientoLista(){
		Alimentos pimiento1 = new Pimiento(5, "Pimiento Roja", 0.15, 20);
		Alimentos pimiento2 = new Pimiento(6, "Pimiento Verde", 0.05, 15);
		Alimentos pimiento3 = new Pimiento(7, "Pimiento Amarillo", 0.1, 25);
		
		List<Alimentos> pimientoLista= new ArrayList();
		
		pimientoLista.add((Pimiento)pimiento1);
		pimientoLista.add((Pimiento)pimiento2);
		pimientoLista.add((Pimiento)pimiento3);
//		this.alimentosLista2= pimientoLista;
		return pimientoLista;
	}

	
	public List<List<Alimentos>> importarProductos() {
		List<List<Alimentos>> alimentosLista2 = new ArrayList<List<Alimentos>>();
		
		alimentosLista2.add(crearPlatanoLista());

		alimentosLista2.add(crearManzanaLista());

		alimentosLista2.add(crearPimientoLista());
		this.alimentosLista=alimentosLista2;
		return alimentosLista2;
	}
	
	
	
}
