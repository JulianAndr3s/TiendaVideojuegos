package com.ceiba.adn.tiendavideojuegos.dominio.modelo;

public class Reserva {
	
	private Long idReserva;
	private Cliente cliente;
	private Videojuego videojuego;
	
	public Reserva(Long idReserva, Cliente cliente, Videojuego videojuego) {
		
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.videojuego = videojuego;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Videojuego getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}
}
