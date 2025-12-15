package es.cursojava.hibernate.ejercicios.ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.CursoRequestDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.entities.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio3.service.AulaService;
import es.cursojava.hibernate.ejercicios.ejercicio3.service.CursoService;

public class Main {

	CursoService serviceC= new CursoService();
	AulaService serviceA = new AulaService();

	public static void main(String[] args) {
		Main main= new Main();

		main.crearCurso();
		main.crearAula();

	}
	
	public List<CursoRequestDTO> crearCurso() {
		CursoRequestDTO curso1 = new CursoRequestDTO("123", "Curso de Floristeria", "Aprender a cuidar flores y montar ramos", 150, true,
				"Basico", "Decoracion", 200, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		CursoRequestDTO curso2 = new CursoRequestDTO("456", "Curso de Peluqueria", "Aprender a cuidar, cortar y decorar pelo", 150, true,
				"Avanzado", "Belleza", 150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		CursoRequestDTO curso3 = new CursoRequestDTO("789", "Curso de Maquillaje", "Aprender a cuidar, maquillar y decorar la cara", 150, true,
				"Avanzado", "Belleza", 150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		List<CursoRequestDTO> cursos = new CopyOnWriteArrayList<CursoRequestDTO>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println("Cursos dados de alta; " );
		for (CursoRequestDTO curso : cursos) {
			serviceA.altaCurso(curso);
			System.out.println(curso);
		}
		
		return cursos;
		
	}
	public List<AulaDTO> crearAula() {
		
		AulaDTO aula1 = new AulaDTO(null, "1", 20, "Planta 2");
		AulaDTO aula2 = new AulaDTO(null, "2", 30, "Planta 1");
		List<AulaDTO> aulas = new CopyOnWriteArrayList<AulaDTO>();
		aulas.add(aula1);
		aulas.add(aula2);
		System.out.println("Cursos dados de alta; " );
		for (AulaDTO aula : aulas) {
			serviceC.altaCurso(aula);
			System.out.println(aula);
		}
		return aulas;
	}
}

