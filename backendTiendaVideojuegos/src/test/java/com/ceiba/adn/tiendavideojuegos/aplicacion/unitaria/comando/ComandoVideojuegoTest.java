package com.ceiba.adn.tiendavideojuegos.aplicacion.unitaria.comando;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando.ComandoVideojuegoTestDataBuilder;

class ComandoVideojuegoTest {

	private static final String NOMBRE = "Call of Duty";
	private static final String GENERO = "Accion";
	private static final LocalDate FECHA_LANZAMIENTO = LocalDate.of(2018, 05, 20);
	private static final Integer PRECIO = 250000;
	private static final String AUTOR = "Activision";
	
	@Test
	void crearVideojuegoConNombre() {
		// Arrange
		ComandoVideojuegoTestDataBuilder videojuegoTestDataBuilder = new ComandoVideojuegoTestDataBuilder().conNombre(NOMBRE);
				
		// Act
		ComandoVideojuego comandoVideojuego = videojuegoTestDataBuilder.build();
				
		// Assert 
		Assertions.assertEquals(NOMBRE, comandoVideojuego.getNombre());
	}
	
	@Test
	void crearVideojuegoConGenero() {
		// Arrange
		ComandoVideojuegoTestDataBuilder videojuegoTestDataBuilder = new ComandoVideojuegoTestDataBuilder().conGenero(GENERO);
				
		// Act
		ComandoVideojuego comandoVideojuego = videojuegoTestDataBuilder.build();
				
		// Assert 
		Assertions.assertEquals(GENERO, comandoVideojuego.getGenero());
	}
	
	@Test
	void crearVideojuegoConFecha() {
		// Arrange
		ComandoVideojuegoTestDataBuilder videojuegoTestDataBuilder = new ComandoVideojuegoTestDataBuilder().conFechaLanzamiento(FECHA_LANZAMIENTO);
				
		// Act
		ComandoVideojuego comandoVideojuego = videojuegoTestDataBuilder.build();
				
		// Assert 
		Assertions.assertEquals(FECHA_LANZAMIENTO, comandoVideojuego.getFechaLanzamiento());
	}
	
	@Test
	void crearVideojuegoConPrecio() {
		// Arrange
		ComandoVideojuegoTestDataBuilder videojuegoTestDataBuilder = new ComandoVideojuegoTestDataBuilder().conPrecio(PRECIO);
				
		// Act
		ComandoVideojuego comandoVideojuego = videojuegoTestDataBuilder.build();
				
		// Assert 
		Assertions.assertEquals(PRECIO, comandoVideojuego.getPrecio());
	}
	
	@Test
	void crearVideojuegoConAutor() {
		// Arrange
		ComandoVideojuegoTestDataBuilder videojuegoTestDataBuilder = new ComandoVideojuegoTestDataBuilder().conAutor(AUTOR);
				
		// Act
		ComandoVideojuego comandoVideojuego = videojuegoTestDataBuilder.build();
				
		// Assert 
		Assertions.assertEquals(AUTOR, comandoVideojuego.getAutor());
	}

}
