package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TazaCafe {
	
	private String tipoCafe;
	private double temperatura;
	
	public TazaCafe(String tipoCafe, double temperatura){
		
		
		this.tipoCafe = tipoCafe;
		this.temperatura = temperatura;
	}

	



	
	
}


