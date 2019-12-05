package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.modelo;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoTestDataBuilder;

class VideojuegoTest {
	
	private static final Long ID_VIDEOJUEGO = 1L;
	private static final String NOMBRE = "FIFA20";
	private static final String GENERO = "Deportivo";
	private static final LocalDate FECHA_LANZAMIENTO = LocalDate.of(2019, 10, 20);
	private static final Integer PRECIO = 190000;
	private static final String AUTOR = "EA Sports";

	@Test
	void crearVideojuegoTest() {
		
		//Arrange
		Videojuego videojuego = new VideojuegoTestDataBuilder().build();
		
		//Act
		videojuego.setIdVideojuego(ID_VIDEOJUEGO);
		videojuego.setNombre(NOMBRE);
		videojuego.setGenero(GENERO);
		videojuego.setFechaLanzamiento(FECHA_LANZAMIENTO);
		videojuego.setPrecio(PRECIO);
		videojuego.setAutor(AUTOR);
		
		//Assert
		Assertions.assertEquals(ID_VIDEOJUEGO, videojuego.getIdVideojuego());
		Assertions.assertEquals(NOMBRE, videojuego.getNombre());
		Assertions.assertEquals(GENERO, videojuego.getGenero());
		Assertions.assertEquals(FECHA_LANZAMIENTO, videojuego.getFechaLanzamiento());
		Assertions.assertEquals(PRECIO, videojuego.getPrecio());
		Assertions.assertEquals(AUTOR, videojuego.getAutor());
	}

}
