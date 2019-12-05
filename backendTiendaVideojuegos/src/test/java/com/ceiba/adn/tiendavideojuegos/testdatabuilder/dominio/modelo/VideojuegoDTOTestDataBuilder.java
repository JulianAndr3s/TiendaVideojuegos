package com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;

public class VideojuegoDTOTestDataBuilder {
	
	private static final Long ID_VIDEOJUEGO = 1L;
	private static final String NOMBRE = "FIFA20";
	private static final String GENERO = "Deportivo";
	private static final LocalDate FECHA_LANZAMIENTO = LocalDate.of(2019, 10, 20);
	private static final Integer PRECIO = 190000;
	private static final String AUTOR = "EA Sports";
	
	private Long idVideojuego;
	private String nombre;
	private String genero;
	private LocalDate fechaLanzamiento;
	private Integer precio;
	private String autor;
	
	public VideojuegoDTOTestDataBuilder() {
		this.idVideojuego = ID_VIDEOJUEGO;
		this.nombre = NOMBRE;
		this.genero = GENERO;
		this.fechaLanzamiento = FECHA_LANZAMIENTO;
		this.precio = PRECIO;
		this.autor = AUTOR;
	}
	
	public VideojuegoDTOTestDataBuilder conIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
		return this;
	}
	
	public VideojuegoDTOTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public VideojuegoDTOTestDataBuilder conGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public VideojuegoDTOTestDataBuilder conFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
		return this;
	}
	
	public VideojuegoDTOTestDataBuilder conPrecio(Integer precio) {
		this.precio = precio;
		return this;
	}
	
	public VideojuegoDTOTestDataBuilder conAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public VideojuegoDTO build() {
		return new VideojuegoDTO(this.idVideojuego, this.nombre, this.genero, this.fechaLanzamiento, 
				this.precio, this.autor);
	}

}
