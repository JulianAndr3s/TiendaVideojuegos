package com.ceiba.adn.tiendavideojuegos.aplicacion.unitaria.comando;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando.ComandoReservaTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoTestDataBuilder;

class ComandoReservaTest {

	private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
	private static final Videojuego VIDEOJUEGO = new VideojuegoTestDataBuilder().build();
	
	@Test
	public void crearReservaConCliente() {
		
		//Arrange
		ComandoReservaTestDataBuilder reservaTestDataBuilder = new ComandoReservaTestDataBuilder().conCliente(CLIENTE);
	
		//Act
		ComandoReserva comandoReserva = reservaTestDataBuilder.build();
		
		//Assert
		Assertions.assertEquals(CLIENTE, comandoReserva.getCliente());
	}
	
	@Test
	public void crearReservaConVideojuego() {
		
		//Arrange
		ComandoReservaTestDataBuilder reservaTestDataBuilder = new ComandoReservaTestDataBuilder().conVideojuego(VIDEOJUEGO);
	
		//Act
		ComandoReserva comandoReserva = reservaTestDataBuilder.build();
		
		//Assert
		Assertions.assertEquals(VIDEOJUEGO, comandoReserva.getVideojuego());
	}

}
