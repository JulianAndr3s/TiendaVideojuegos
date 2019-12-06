package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;

import java.time.LocalDate;

public class VideojuegoDTO {
	
	private Long idVideojuegoDTO;
	private String nombreDTO;
	private String generoDTO;
	private LocalDate fechaLanzamientoDTO;
	private Integer precioDTO;
	private String autorDTO;
	
	public VideojuegoDTO(Long idVideojuego, String nombre, String genero, LocalDate fechaLanzamiento, Integer precio,
			String autor) {
		super();
		this.idVideojuegoDTO = idVideojuego;
		this.nombreDTO = nombre;
		this.generoDTO = genero;
		this.fechaLanzamientoDTO = fechaLanzamiento;
		this.precioDTO = precio;
		this.autorDTO = autor;
	}
	
	public VideojuegoDTO() {
		
	}
	
	
	public Long getIdVideojuegoDTO() {
		return idVideojuegoDTO;
	}

	public void setIdVideojuegoDTO(Long idVideojuego) {
		this.idVideojuegoDTO = idVideojuego;
	}

	public String getNombreDTO() {
		return nombreDTO;
	}

	public void setNombreDTO(String nombre) {
		this.nombreDTO = nombre;
	}

	public String getGeneroDTO() {
		return generoDTO;
	}

	public void setGeneroDTO(String genero) {
		this.generoDTO = genero;
	}

	public LocalDate getFechaLanzamientoDTO() {
		return fechaLanzamientoDTO;
	}

	public void setFechaLanzamientoDTO(LocalDate fechaLanzamiento) {
		this.fechaLanzamientoDTO = fechaLanzamiento;
	}

	public Integer getPrecioDTO() {
		return precioDTO;
	}

	public void setPrecioDTO(Integer precio) {
		this.precioDTO = precio;
	}

	public String getAutorDTO() {
		return autorDTO;
	}

	public void setAutorDTO(String autor) {
		this.autorDTO = autor;
	}

}
