package com.ceiba.adn.tiendavideojuegos.aplicacion.comando;

import java.time.LocalDate;

public class ComandoVideojuego {
	
	private Long idVideojuego;
	private String nombre;
	private String genero;
	private LocalDate fechaLanzamiento;
	private Integer precio;
	private String autor;
	
	public ComandoVideojuego(Long idVideojuego, String nombre, String genero, LocalDate fechaLanzamiento,
			Integer precio, String autor) {
		this.idVideojuego = idVideojuego;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaLanzamiento = fechaLanzamiento;
		this.precio = precio;
		this.autor = autor;
	}
	
	public ComandoVideojuego() {
		
	}
	

	public Long getIdVideojuego() {
		return idVideojuego;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public Integer getPrecio() {
		return precio;
	}

	public String getAutor() {
		return autor;
	}
}
