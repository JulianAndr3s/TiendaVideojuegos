package com.ceiba.adn.tiendavideojuegos.aplicacion.comando;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;

public class ComandoReserva {
	
	private Long idReserva;
	private Cliente cliente;
	private Videojuego videojuego;
	
	public ComandoReserva(Long idReserva, Cliente cliente, Videojuego videojuego) {
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.videojuego = videojuego;
	}

	public ComandoReserva() {

	}

	public Long getIdReserva() {
		return idReserva;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Videojuego getVideojuego() {
		return videojuego;
	}
}
