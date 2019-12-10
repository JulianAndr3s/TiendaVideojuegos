package com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;

public class ComandoVideojuegoTestDataBuilder {
	
	private static final Long ID_VIDEOJUEGO = 1L;
	private static final String NOMBRE = "Call of Duty";
	private static final String GENERO = "Accion";
	private static final LocalDate FECHA_LANZAMIENTO = LocalDate.of(2018, 05, 21);
	private static final Integer PRECIO = 250000;
	private static final String AUTOR = "Activision";
	
	private Long idVideojuego;
	private String nombre;
	private String genero;
	private LocalDate fechaLanzamiento;
	private Integer precio;
	private String autor;
	
	public ComandoVideojuegoTestDataBuilder() {
		this.idVideojuego = ID_VIDEOJUEGO;
		this.nombre = NOMBRE;
		this.genero = GENERO;
		this.fechaLanzamiento = FECHA_LANZAMIENTO;
		this.precio = PRECIO;
		this.autor = AUTOR;
	}
	
	public ComandoVideojuegoTestDataBuilder conIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
		return this;
	}
	
	public ComandoVideojuegoTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoVideojuegoTestDataBuilder conGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public ComandoVideojuegoTestDataBuilder conFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
		return this;
	}
	
	public ComandoVideojuegoTestDataBuilder conPrecio(Integer precio) {
		this.precio = precio;
		return this;
	}
	
	public ComandoVideojuegoTestDataBuilder conAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public ComandoVideojuego build() {
		return new ComandoVideojuego(this.idVideojuego, this.nombre, this.genero,
				this.fechaLanzamiento, this.precio, this.autor);
	}
}
