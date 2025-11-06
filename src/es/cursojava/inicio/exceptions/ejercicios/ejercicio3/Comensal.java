package es.cursojava.inicio.exceptions.ejercicios.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Comensal extends Cliente{
	

	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva=tieneReserva;
	}
}
