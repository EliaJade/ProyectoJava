package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public  class Cliente {
	
	
	private String nombre;
	
	public  void tomarCafe(TazaCafe tazaCafe) throws TooColdTemperatureException, TooHotTemperatureException{
	if(this instanceof Huesped) {
		throw new IllegalArgumentException("El cliente " +this.getNombre()+" no puede ser huesped y tomar cafe");
	}
		if (tazaCafe.getTemperatura()>80) {
			throw new TooHotTemperatureException("El "+ tazaCafe.getTipoCafe()+" esta demasiado caliente");
		
		}
		else if(this instanceof ClienteAdicto) {
			System.out.println(this.getNombre() + " esta tomando "+tazaCafe.getTipoCafe());
		}
		if (tazaCafe.getTemperatura()<20) {
				throw new TooColdTemperatureException("El "+tazaCafe.getTipoCafe()+" esta demasiado frio");
		}
		else if(this instanceof Comensal) {
			System.out.println(this.getNombre() + " esta tomando " +tazaCafe.getTipoCafe());
			
		} 
		
	
	
//	if(tazaCafe.getTemperatura()>80) {
//		throw new TooHotTemperatureException("El "+ tazaCafe.getTipoCafe()+" esta demasiado caliente");
//	}
//	if(tazaCafe.getTemperatura()<20) {
//		throw new TooColdTemperatureException("El "+tazaCafe.getTipoCafe()+" esta demasiado frio");
//	}
}
}
