package es.cursojava.spring.beans.calculadora.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.cursojava.spring.beans.calculadora.beans.Operacion;
import es.cursojava.spring.beans.calculadora.beans.SoloAdmin;
import es.cursojava.spring.beans.calculadora.beans.Usuario;

@Service
public class CalculadoraService2 {
	private List<Operacion> operaciones;

	public CalculadoraService2(List<Operacion> operaciones) {
		this.operaciones=operaciones;
	}
	
	@SoloAdmin
	public double calcular(Usuario usuario, String simbolo, double a, double b) {
		for(Operacion op : operaciones) {
			if(op.getSimbolo().equals(simbolo)) {
				return op.calcular(a, b);
			}
		}
		throw new IllegalArgumentException("Operacion no valido");
	}
	

}
