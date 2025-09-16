package es.cursojava.inicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolaMundoo {
	
	
	
	public static void main (String[] args){
		
		Log.debug("Hola");
		Log.info("Hola2");
		Log.warn("Holaaa");
		
//		
//		System.out.println("HolaMundo!");
//		System.out.println("HelloWorld!");
//
//		
//		System.out.println("HolaMundo2");
		
	}
	private final static Logger Log = LoggerFactory.getLogger(HolaMundoo.class);
	
}
