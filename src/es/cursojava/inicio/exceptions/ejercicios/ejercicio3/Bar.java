package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Bar {
	
	private String nombre;
	
	public static void main(String[]args) {
		Bar bar = new Bar();
		List<Cliente> clientes = bar.abrirBar();
		

//			TazaCafe cafe = new TazaCafe("Cafe solo", 90);
			for (Cliente cliente : clientes) {
				try {

					TazaCafe cafe = Utilidades.crearCafe();
					cliente.tomarCafe(cafe);
				} catch(IllegalArgumentException iae){
					System.err.println(iae.getMessage());
				} catch (TooHotTemperatureException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage()+ " para " + cliente.getNombre());
				} catch (TooColdTemperatureException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage()+ " para " + cliente.getNombre());
				
				}
		}
			 
		
		
//			TazaCafe cafe2 = new TazaCafe("Cafe con leche", 50);
//			for (Cliente cliente : clientes) {
//
//				try {
//					cliente.tomarCafe(Utilidades.crearCafe());
//				} catch(IllegalArgumentException iae) {
//					System.err.println(iae.getMessage());
//					continue;
//				} catch (TooHotTemperatureException e) {
//					// TODO Auto-generated catch block
//					System.err.println(e.getMessage()+ " para " + cliente.getNombre());
//				} catch (TooColdTemperatureException e) {
//					// TODO Auto-generated catch block
//					System.err.println(e.getMessage()+ " para " + cliente.getNombre());
//				
//				}
//			}	
		
		
		
		
			
		
		
		
	}
	
	public List<Cliente> abrirBar() {
		Huesped huesped = new Huesped("Sam", "Y111");
		Comensal comensal = new Comensal("John", true);
		ClienteAdicto clienteAdicto= new ClienteAdicto("Sonia", "local drunk");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(clienteAdicto);
		clientes.add(comensal);
		clientes.add(huesped);
		
		return clientes;
		}

}
