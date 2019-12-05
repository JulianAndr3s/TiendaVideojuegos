package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.modelo.dto;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoDTOTestDataBuilder;


class VideojuegoDTOTest {

	private static final Long ID_VIDEOJUEGO = 1L;
	private static final String NOMBRE = "FIFA20";
	private static final String GENERO = "Deportivo";
	private static final LocalDate FECHA_LANZAMIENTO = LocalDate.of(2019, 10, 20);
	private static final Integer PRECIO = 190000;
	private static final String AUTOR = "EA Sports";

	@Test
	void crearVideojuegoDTOTest() {
		
		//Arrange
		VideojuegoDTO videojuegoDTO = new VideojuegoDTOTestDataBuilder().build();
		
		//Act
		videojuegoDTO.setIdVideojuego(ID_VIDEOJUEGO);
		videojuegoDTO.setNombre(NOMBRE);
		videojuegoDTO.setGenero(GENERO);
		videojuegoDTO.setFechaLanzamiento(FECHA_LANZAMIENTO);
		videojuegoDTO.setPrecio(PRECIO);
		videojuegoDTO.setAutor(AUTOR);
		
		//Assert
		Assertions.assertEquals(ID_VIDEOJUEGO, videojuegoDTO.getIdVideojuego());
		Assertions.assertEquals(NOMBRE, videojuegoDTO.getNombre());
		Assertions.assertEquals(GENERO, videojuegoDTO.getGenero());
		Assertions.assertEquals(FECHA_LANZAMIENTO, videojuegoDTO.getFechaLanzamiento());
		Assertions.assertEquals(PRECIO, videojuegoDTO.getPrecio());
		Assertions.assertEquals(AUTOR, videojuegoDTO.getAutor());
	}

}
