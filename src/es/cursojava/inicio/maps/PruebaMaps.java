package es.cursojava.inicio.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import es.cursojava.inicio.objetos.herencia.ejercicios.hospital.Persona;

public class PruebaMaps {
	
	public static void main(String[]args) {
		
		Map<String,Persona> personas = new HashMap();
		
//		Persona p = new Persona ("Sara", 24, "111A");
//		personas.put("222B", new Persona("Elia", 23, "222B"));
//		personas.put(p.getDni(), p);
//		Persona p2 = personas.put(p.getDni(), p);
//		System.out.println(p2.getNombre()); //va imprimir el ultimo valor asociado anteriormente a la clave o null, en este caso duevuelve Sara porque es el ultimo valor que fue asociando a este persona
//		Persona p4 = new Persona ("Noelia", 20, "111A");
//		personas.put(p4.getDni(), p4);
//		System.out.println(p4.getNombre());
		
		
		Persona p = new Persona ("Sara", 24, "111A");
		personas.put(p.getDni(), p);
		Persona p2 = new Persona ("Elia", 24, "111A");

		Persona p4 = new Persona ("Susi", 24, "222A");
		Persona p3 = personas.put(p2.getDni(), p2);
		System.out.println(p3.getNombre());	//va imprimir el ultimo valor asociado anteriormente a la clave o null, en este caso duevuelve Sara porque es el ultimo valor que fue asociando a 111A
		 p3 = personas.put(p4.getDni(), p4);
//		 System.out.println(p3.getNombre());	//aqui da un null pointer exception porque no habia nada asociado anteriormente a la clave 222B
		 
		 
		 //Recupero los datps de una persona
		 System.out.println("Introduce un dni");
		 Scanner scan = new Scanner(System.in);
//		 String dni = scan.nextLine();
		 String dni = "111A";
		 Persona persona = personas.get(dni);
		 System.out.println(persona.getNombre());
		 
		 
		 
		 //OBtener todas las claves (en este caso dni)
		 Set<String> dnis= personas.keySet(); 
		 for (String dniPersona : dnis) {
			 System.out.println(dniPersona);
		 }
		 
		 //Obtengo todas los valores a partir de las claves
		 for (String dniPersona : dnis) {
			Persona personaValor = personas.get(dni);
			System.out.println(personaValor.getNombre());
		}
		 
		 
		 //Obtengo todos los valores sin usar la clave
		 Collection<Persona> colPersonas= personas.values();
		 for(Persona persona2 : colPersonas) {
			 System.out.println(persona2.getNombre());
		 }
		 
		 
		 
		Set<Entry<String, Persona>> entries = personas.entrySet();
		for (Entry<String, Persona> entry : entries) {
			System.out.println("===========================\n"+entry.getKey()+ " "+(entry.getValue().getNombre()));
		}
		
		personas.remove("111A");
		System.out.println(personas.get("111A"));  //Devuelve null porque con el remove se ha borrado la persona con ese dni
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
