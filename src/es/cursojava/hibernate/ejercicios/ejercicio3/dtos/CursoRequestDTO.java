package es.cursojava.hibernate.ejercicios.ejercicio3.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CursoRequestDTO(
		String codigo,
		String nombre, 
		String description, 
		int horasTotales,
		boolean activo,
		String nivel,
		String categoria, 
		double precio, 
		LocalDate fechaInicio,
		LocalDate fechaFin,
		LocalDateTime fechaCreacion) {

}
