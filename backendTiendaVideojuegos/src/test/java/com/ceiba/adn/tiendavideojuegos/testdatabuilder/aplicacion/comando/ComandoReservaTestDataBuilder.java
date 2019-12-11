package com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoTestDataBuilder;

public class ComandoReservaTestDataBuilder {
	
	private static final Long ID_RESERVA = 1L;
	private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
	private static final Videojuego VIDEOJUEGO = new VideojuegoTestDataBuilder().build();
	
	private Long idReserva;
	private Cliente cliente;
	private Videojuego videojuego;
	
	public ComandoReservaTestDataBuilder() {
		this.idReserva = ID_RESERVA;
		this.cliente = CLIENTE;
		this.videojuego = VIDEOJUEGO;
	}
	
	public ComandoReservaTestDataBuilder conCliente(Cliente cliente){
		this.cliente = cliente;
		return this;
	}
	
	public ComandoReservaTestDataBuilder conVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
		return this;
	}
	
	public ComandoReserva build() {
		return new ComandoReserva (this.idReserva,this.cliente,this.videojuego);
	}
}
