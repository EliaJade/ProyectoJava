package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.Alimentos;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Manzana;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Pimiento;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Platano;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.Pago;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoCriptomoneda;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoPayPal;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.PagoTarjetaCredito;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio2.ProcesadorPagos;

public class MainSupermercado {

	public static void main(String[]args) {
		MainSupermercado main = new MainSupermercado();		
		Supermercado supermercado1 = main.abrirSupermercado();

		
		int totalPrecio = (int) main.iniciarCompras(supermercado1);
		
		main.pagar(supermercado1.getClientes(), totalPrecio);
	}
	
	public Supermercado abrirSupermercado() {
		Supermercado supermercado1 = new Supermercado("Supermercado");
		supermercado1.importarProductos();
		ClienteSupermercado cliente1 = new ClienteSupermercado("Samuel");
		ClienteSupermercado cliente2 = new ClienteSupermercado("Natalia");
		supermercado1.addClientes(cliente1);
		supermercado1.addClientes(cliente2);
		return supermercado1;
	}
	
	private double iniciarCompras(Supermercado supermercado) {
		List<ClienteSupermercado>clientes=supermercado.getClientes();
		List<List<Alimentos>> alimentosLista = supermercado.getAlimentosLista();
		double totalPrecio =0;
		for(ClienteSupermercado clienteSupermercado : clientes) {
			int numeroSeleccionado = -7;

			
			int contadorDeAlimento = 1;
			System.out.println("Bienvenido " + clienteSupermercado.getNombre());
			System.out.println("Tienes los siguientes productos");
			
			do {
				System.out.println("Introduce el producto que desea añadir a tu cesta, si no quiere añadir nada a su cesta pon 0");
					List<List<Alimentos>> alimentos1 = supermercado.getAlimentosLista();
						
						for (List<Alimentos> listaAlimentos : alimentos1) {
							int numProductos = listaAlimentos.size();
							if (numProductos>0) {
								System.out.println(listaAlimentos.getFirst().getClass().getSimpleName() 
									+ "-"+ numProductos);
							}
						}
					
				
				Scanner scan = new Scanner (System.in);
				String producto= scan.nextLine();
				String productoRecorrido = "";
				int cantidadSeleccionado = 0;
				boolean recorreMenu = false;
				if(producto.equals("0")) {
					break;
				}
				
				for (List<Alimentos> alimentos : alimentosLista) {
					if (alimentos.size()>0) {
						productoRecorrido = alimentos.getFirst().getClass().getSimpleName();
						if(producto.equalsIgnoreCase(productoRecorrido)) {
							recorreMenu= true;
							for (Alimentos alimento : alimentos) {

								if(producto.equalsIgnoreCase(alimento.getClass().getSimpleName())) {
									if(alimento.getCantidad()!=0){
										System.out.println(alimento.getId() + "." +alimento.getNombre() + ":\n\tCantidad disponible: " + alimento.getCantidad()+ "\n\tPrecio: " + alimento.getPrecio() + " euros");
										
								}
									contadorDeAlimento++;
								}
							}
							}
						}else {
							System.out.println("No tenemos este producto, asegura que lo haya escrito bien");
						}
						

						
						}
				if(recorreMenu==true) {
					System.out.println("Introduce el codigo del producto que desea añadir a tu cesta, si no quiere añadir nada a su cesta pon 0");

					 scan = new Scanner (System.in);
					numeroSeleccionado = scan.nextInt();
					
					
					System.out.println("Introduce la cantidad del producto que desea añadir a tu cesta");

					scan = new Scanner (System.in);
					cantidadSeleccionado = scan.nextInt();
				}
				
					
				for (List<Alimentos> alimentos : alimentosLista) {
					
					productoRecorrido = alimentos.getFirst().getClass().getSimpleName();
					Alimentos eliminarAlimento = null;
					for (Alimentos alimento : alimentos) {
						if(numeroSeleccionado==alimento.getId()) {
							if(alimento.getCantidad() - cantidadSeleccionado>=0) {
								alimento.setCantidad(alimento.getCantidad() - cantidadSeleccionado);
								double totalPrecio1 = totalPrecio;
								totalPrecio = alimento.getPrecio() * cantidadSeleccionado;
								totalPrecio = totalPrecio + totalPrecio1;
								System.out.println("Has elegido " + cantidadSeleccionado + " " + alimento.getNombre() + "\nSu total quedaria en " + totalPrecio );
								if (producto.equalsIgnoreCase(productoRecorrido)) {
									System.out.println(alimento.getCantidad());
									alimento = alimentos.getLast();
									clienteSupermercado.addAlimento(alimento);
									if(alimento.getCantidad()==0) {

										 eliminarAlimento = alimento;  // ⚠️ Marcar para eliminar después
							                
								}
								}
							}
							
						}
					}
					
					if (eliminarAlimento != null) {
					    alimentos.remove(eliminarAlimento);  // ✅ Remover fuera del bucle
					    System.out.println("Eliminando " + producto);
					}
			}
				if(recorreMenu==false) {
					System.out.println("No tenemos ese producto disponible, asegura que lo haya escrito bien");
				
			}
					

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
		return totalPrecio;
		
			
	}
	
	private void pagar (List<ClienteSupermercado> clientes, int totalPrecio) {
		System.out.println("=========== Pagando =================");
		for (ClienteSupermercado clienteSupermercado : clientes) {
			List<Alimentos> productos = clienteSupermercado.getCarritoCompra();
			double total = 0.0;
			System.out.println("Cliente "+clienteSupermercado.getNombre());
			System.out.println("Lista de la compra: ");
			
			for (Alimentos alimento : productos) {
				System.out.println("\t"+ alimento.getNombre() + "-" + alimento.getPrecio());
				total += alimento.getPrecio();
				
			
			
				
			}
			System.out.println("\tTotal compra:" +totalPrecio);
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
		

	
	
	
}
