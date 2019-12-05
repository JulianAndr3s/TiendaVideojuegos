package com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;

public class VideojuegoTestDataBuilder {
	
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
	
	public VideojuegoTestDataBuilder() {
		this.idVideojuego = ID_VIDEOJUEGO;
		this.nombre = NOMBRE;
		this.genero = GENERO;
		this.fechaLanzamiento = FECHA_LANZAMIENTO;
		this.precio = PRECIO;
		this.autor = AUTOR;
	}
	
	public VideojuegoTestDataBuilder conIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
		return this;
	}
	
	public VideojuegoTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public VideojuegoTestDataBuilder conGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public VideojuegoTestDataBuilder conFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
		return this;
	}
	
	public VideojuegoTestDataBuilder conPrecio(Integer precio) {
		this.precio = precio;
		return this;
	}
	
	public VideojuegoTestDataBuilder conAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public Videojuego build() {
		return new Videojuego(this.idVideojuego, this.nombre, this.genero, this.fechaLanzamiento, 
				this.precio, this.autor);
	}

}
