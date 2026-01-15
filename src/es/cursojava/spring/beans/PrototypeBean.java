package es.cursojava.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //se genera un objeto cada vez que lo necesito
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("CREADO PrototypeBean: " + this);
	}
}
