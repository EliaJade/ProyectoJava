package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Consultable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Deletable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Insertable;
import es.cursojava.inicio.interfaces.ejercicios.ejercicio1.interfaces.Updatable;

public class Objetos {
	
	public static void selectObject(Consultable objeto) {
		
		objeto.select();
	}
	
	public static void insertObject(Insertable objeto) {
		objeto.insert();
	}
	
	public static void updateObject(Updatable objeto) {
		objeto.update();
	}
	
	public static void deleteObject(Deletable objeto) {
		objeto.delete();
	}

}
