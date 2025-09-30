package es.cursojava.inicio.interfaces.ejercicios.ejercicio1;

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
