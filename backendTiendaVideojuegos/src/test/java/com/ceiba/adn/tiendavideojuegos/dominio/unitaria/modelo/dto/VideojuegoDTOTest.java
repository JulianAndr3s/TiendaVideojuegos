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
		videojuegoDTO.setIdVideojuegoDTO(ID_VIDEOJUEGO);
		videojuegoDTO.setNombreDTO(NOMBRE);
		videojuegoDTO.setGeneroDTO(GENERO);
		videojuegoDTO.setFechaLanzamientoDTO(FECHA_LANZAMIENTO);
		videojuegoDTO.setPrecioDTO(PRECIO);
		videojuegoDTO.setAutorDTO(AUTOR);
		
		//Assert
		Assertions.assertEquals(ID_VIDEOJUEGO, videojuegoDTO.getIdVideojuegoDTO());
		Assertions.assertEquals(NOMBRE, videojuegoDTO.getNombreDTO());
		Assertions.assertEquals(GENERO, videojuegoDTO.getGeneroDTO());
		Assertions.assertEquals(FECHA_LANZAMIENTO, videojuegoDTO.getFechaLanzamientoDTO());
		Assertions.assertEquals(PRECIO, videojuegoDTO.getPrecioDTO());
		Assertions.assertEquals(AUTOR, videojuegoDTO.getAutorDTO());
	}

}
