package com.ceiba.adn.tiendavideojuegos.infraestructura.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class ReservaEntidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reserva")
	private Long idReserva;
	@ManyToOne()
    @JoinColumn(name = "id_cliente")
    private ClienteEntidad cliente;
	@ManyToOne()
    @JoinColumn(name = "id_videojuego")
    private VideojuegoEntidad videojuego;
	
	public ReservaEntidad(Long idReserva, ClienteEntidad cliente, VideojuegoEntidad videojuego) {
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.videojuego = videojuego;
	}

	public ReservaEntidad() {
		
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public ClienteEntidad getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntidad cliente) {
		this.cliente = cliente;
	}

	public VideojuegoEntidad getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(VideojuegoEntidad videojuego) {
		this.videojuego = videojuego;
	}
}
