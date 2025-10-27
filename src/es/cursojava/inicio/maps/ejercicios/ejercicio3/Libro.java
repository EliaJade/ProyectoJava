package es.cursojava.inicio.maps.ejercicios.ejercicio3;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String isbn;
	private int anios;
	
	public Libro(String titulo, String isbn, int anios) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.anios = anios;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anios, isbn, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anios == other.anios && Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}
	
	

}
