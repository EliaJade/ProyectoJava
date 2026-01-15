package es.cursojava.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //se puede crear varios objetos de este tipo
public class Ticket {
	private long id = System.nanoTime();

	public long getId() {
		return id;
	}
}