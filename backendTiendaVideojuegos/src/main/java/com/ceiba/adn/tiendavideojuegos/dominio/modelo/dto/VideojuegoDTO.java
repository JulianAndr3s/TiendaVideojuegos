package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;

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
	
	
	public Long getIdVideojuego() {
		return idVideojuegoDTO;
	}

	public void setIdVideojuego(Long idVideojuego) {
		this.idVideojuegoDTO = idVideojuego;
	}

	public String getNombre() {
		return nombreDTO;
	}

	public void setNombre(String nombre) {
		this.nombreDTO = nombre;
	}

	public String getGenero() {
		return generoDTO;
	}

	public void setGenero(String genero) {
		this.generoDTO = genero;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamientoDTO;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamientoDTO = fechaLanzamiento;
	}

	public Integer getPrecio() {
		return precioDTO;
	}

	public void setPrecio(Integer precio) {
		this.precioDTO = precio;
	}

	public String getAutor() {
		return autorDTO;
	}

	public void setAutor(String autor) {
		this.autorDTO = autor;
	}
	
	public Videojuego construir(){
		 return new Videojuego(this.idVideojuegoDTO,this.nombreDTO,this.generoDTO,
				 this.fechaLanzamientoDTO,this.precioDTO,this.autorDTO);
	 }

}
