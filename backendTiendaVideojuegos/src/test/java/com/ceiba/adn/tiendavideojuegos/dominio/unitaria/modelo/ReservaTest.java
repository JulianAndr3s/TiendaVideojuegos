package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ReservaTestDataBuilder;

class ReservaTest {
	
	private static final Long ID_RESERVA = 1L;
	private static final Cliente CLIENTE = Mockito.mock(Cliente.class);
	private static final Videojuego VIDEOJUEGO = Mockito.mock(Videojuego.class);
	
	@Test
	public void crearReservaTest() {
		
		//Arrange
		Reserva reserva = new ReservaTestDataBuilder().build();
		
		//Act
		reserva.setIdReserva(ID_RESERVA);
		reserva.setCliente(CLIENTE);
		reserva.setVideojuego(VIDEOJUEGO);
		
		//Assert
		Assertions.assertEquals(ID_RESERVA, reserva.getIdReserva());
		Assertions.assertEquals(CLIENTE, reserva.getCliente());
		Assertions.assertEquals(VIDEOJUEGO, reserva.getVideojuego());
		
	}
}
