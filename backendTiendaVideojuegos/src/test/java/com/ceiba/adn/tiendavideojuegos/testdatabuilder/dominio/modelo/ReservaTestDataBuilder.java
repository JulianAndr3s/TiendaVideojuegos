package com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;

public class ReservaTestDataBuilder {
	
	private static final Long ID_RESERVA = 1L;
	private static final Cliente CLIENTE = new Cliente(1L,"Julian","Botero","5666804","juanbo97@hotmail.com", "1036402404","Activo");
	private static final Videojuego VIDEOJUEGO = new Videojuego(1L,"FIFA19","Deporte", LocalDate.of(2019, 12, 11), 250000,"EA");
	
	private Long idReserva;
	private Cliente cliente;
	private Videojuego videojuego;
	
	public ReservaTestDataBuilder() {
		this.idReserva = ID_RESERVA;
		this.cliente = CLIENTE;
		this.videojuego = VIDEOJUEGO;
	}
	
	public ReservaTestDataBuilder conCliente(Cliente cliente){
		this.cliente = cliente;
		return this;
	}
	
	public ReservaTestDataBuilder conVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
		return this;
	}
	
	public Reserva build() {
		return new Reserva (this.idReserva,this.cliente,this.videojuego);
	}
}
