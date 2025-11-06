package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TazaCafe {
	
	private String tipoCafe;
	private double temperatura;
	
	public TazaCafe(String tipoCafe, double temperatura) {
		if(temperatura>80) {
			throw new IllegalArgumentException("El cafe esta demasiado caliente");
		}
		if(temperatura<20) {
			throw new IllegalArgumentException("El cafe esta demasiado frio");
		}
		
		this.tipoCafe = tipoCafe;
		this.temperatura = temperatura;
	}

	public void tomarCafe(Cliente cliente) {
		try {
			if(cliente instanceof ClienteAdicto) {
				System.out.println(cliente.getNombre() + " esta tomando cafe");
			}
			if(cliente instanceof Comensal) {
				System.out.println(cliente.getNombre() + " esta tomando cafe");
				
			}
		}catch(IllegalArgumentException iae){
			System.err.println("El cliente " + cliente.getNombre() + " no puede tomar cafe "+iae.getMessage());
			
		}
	}



	
	
}


