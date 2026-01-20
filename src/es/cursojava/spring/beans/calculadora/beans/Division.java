package es.cursojava.spring.beans.calculadora.beans;

import org.springframework.stereotype.Component;

@Component("divide")
public class Division implements Operacion{

	@Override
	public double calcular(double a, double b) {
		return a/b;
	}

	@Override
	public String getSimbolo() {
		
		return "/";
	}

}
