package com.ceiba.adn.tiendavideojuegos.dominio.modelo;

import java.time.LocalDate;

public class Videojuego {
	
	private Long idVideojuego;
	private String nombre;
	private String genero;
	private LocalDate fechaLanzamiento;
	private Integer precio;
	private String autor;
	
	public Videojuego(Long idVideojuego, String nombre, String genero, LocalDate fechaLanzamiento,
			Integer precio, String autor) {
		this.idVideojuego = idVideojuego;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaLanzamiento = fechaLanzamiento;
		this.precio = precio;
		this.autor = autor;
	}

	public Long getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
