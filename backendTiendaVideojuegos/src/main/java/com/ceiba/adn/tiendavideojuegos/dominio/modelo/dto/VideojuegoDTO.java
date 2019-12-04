package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;

import java.util.Date;

public class VideojuegoDTO {
	
	private Long idVideojuego;
	private String nombre;
	private String genero;
	private Date fechaLanzamiento;
	private Integer precio;
	private String autor;
	
	public VideojuegoDTO(Long idVideojuego, String nombre, String genero, Date fechaLanzamiento, Integer precio,
			String autor) {
		super();
		this.idVideojuego = idVideojuego;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaLanzamiento = fechaLanzamiento;
		this.precio = precio;
		this.autor = autor;
	}
	
	public VideojuegoDTO() {
		
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

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
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
