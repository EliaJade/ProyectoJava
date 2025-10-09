package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Apagable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Deletable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Encendible;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Insertable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Bicicleta;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Coche;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Manzana;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.pojos.Movil;

public class Main {

	public static void main(String []args) {
		Main main = new Main();
		Vehiculo v1 = new Coche(1, "coche", 500000, "V8", "BMW") ;
		Vehiculo v2 = new Bicicleta(2, "bici" , 100 , 7);
		Encendible p3 = new Movil(11, "Movil2", 30, "12/03/2024", "Shammysung");
		Producto p1=new Manzana(111, "Manzana Golden", 1, "12/01/2026", "verde");
		Producto p2=new Movil(22, "Movil", 300, "12/03/2023", "Samsung");
		
		
//		Vehiculo[] vehiculos = {v1,v2};
		main.runAparato(p3, (Apagable) p3);

		main.runAparato((Encendible)v1, (Apagable) v1);
		
		Objetos.selectObject(v2);

		Objetos.selectObject(v1);
		Objetos.selectObject(p1);
		Objetos.selectObject(p2);
		
		Objetos.insertObject((Insertable) v1);
//		Objetos.deleteObject((Deletable) p1); //Da error porque la manazana solo tiene implemented consulta

		Objetos.deleteObject((Deletable) v2);
		
		
	}
	
//	public Producto[] crearProductos() {
//		
//		Producto p1=new Manzana("111p", "Manzana Golden", 1, "12/01/2026", "verde");
//		Producto p2=new Movil("222p", "Movil", 300, "12/03/2023", "Samsung");
//		
//		Encendible p3 = new Movil("333p", "Movil2", 30, "12/03/2024", "Shammysung");
//		
//		Producto[] productos = {p1,p2};
//		return productos;
//	}
	
//	public Vehiculo[] crearVehiclos() {
//		Vehiculo v1 = new Coche("111v", "coche", 500000, "V8", "BMW") ;
//		Vehiculo v2 = new Bicicleta("222v", "bici" , 100 , 7);
//		Vehiculo[] vehiculos = {v1,v2};
//		return vehiculos;
//	}
//	
	public void runAparato(Encendible aparato, Apagable aparato2) {
		aparato.encender();
		aparato2.apagar();
		
	}
	
}
