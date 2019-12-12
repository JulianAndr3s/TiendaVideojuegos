package com.ceiba.adn.tiendavideojuegos.infraestructura.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
}
