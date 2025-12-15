package es.cursojava.hibernate.ejercicios.ejercicio3.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aula {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true, length = 100)
	private String codigoAula;
	@Column
	private Integer capacidad;
	@Column(length = 200)
	private String ubicacion;
	public Aula(String codigoAula, Integer capacidad, String ubicacion) {
		super();
		this.codigoAula = codigoAula;
		this.capacidad = capacidad;
		this.ubicacion = ubicacion;
	}
	
	
}


