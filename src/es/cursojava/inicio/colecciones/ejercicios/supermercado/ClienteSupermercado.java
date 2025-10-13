package es.cursojava.inicio.colecciones.ejercicios.supermercado;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Producto;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.Pago;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoCriptomoneda;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoPayPal;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoTarjetaCredito;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.ProcesadorPagos;

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
	public void addAlimento (Alimentos alimento) {
		this.carritoCompra.add(alimento);
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
	public void comprar(List<List<Alimentos>> alimentosLista) {
		int numeroSeleccionado = 1;

		double totalPrecio =0;
		do {
			System.out.println("Introduce el numero del producto que desea añadir a tu cesta, si no quiere añadir nada a su cesta pon 0");

			Scanner scan = new Scanner (System.in);
			numeroSeleccionado = scan.nextInt();
			if(numeroSeleccionado == 0) {
				break;
			}
			System.out.println("Introduce la cantidad del producto que desea añadir a tu cesta");

			scan = new Scanner (System.in);
			int cantidadSeleccionado = scan.nextInt();
			
			for (List<Alimentos> alimentos : alimentosLista) {
				for (Alimentos alimento : alimentos) {
					if(numeroSeleccionado==alimento.getId()) {
						if(alimento.getCantidad() - cantidadSeleccionado>=0) {
							alimento.setCantidad(alimento.getCantidad() - cantidadSeleccionado);
							double totalPrecio1 = totalPrecio;
							totalPrecio = alimento.getPrecio() * cantidadSeleccionado;
							totalPrecio = totalPrecio + totalPrecio1;
							System.out.println("Has elegido " + cantidadSeleccionado + " " + alimento.getNombre() + "\nSu total quedaria en " + totalPrecio );
							
						} else {
							System.out.println("No tenemos suficientes "+ alimento.getNombre() + ", lo siento");
						}
						
					}
				}
		}
//			for (List<Alimentos> alimentos : alimentosLista) {
//				for (Alimentos alimento : alimentos) {
//					if(alimento.getCantidad()==0) {
//						alimentosLista.remove(alimento.getId());	
//					}
//				}
//			}
		} while(numeroSeleccionado!=0);
		System.out.println("Quiere realizar su pago por:\n\t1.Tarjeta\n\t2.Cripto Moneda\n\t3.PayPal");

		Scanner scan = new Scanner (System.in);
		int metodoPagoSeleccionado = scan.nextInt();

		double monto = totalPrecio;
		if(metodoPagoSeleccionado==1) {
			Pago pagoTarjetaCredito = new PagoTarjetaCredito();
			ProcesadorPagos.realizarPago(pagoTarjetaCredito, monto);
		} 
		else if(metodoPagoSeleccionado==2) {
			Pago pagoCriptomoneda = new PagoCriptomoneda();	
			ProcesadorPagos.realizarPago(pagoCriptomoneda, monto);
		}
		else if(metodoPagoSeleccionado==3) {
			Pago pagoPayPal = new PagoPayPal();
			ProcesadorPagos.realizarPago(pagoPayPal, monto);
		} else {
			System.out.println("Pago cancelado");
		}
	}
	
	
}
