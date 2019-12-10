package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;

@Component
public class FabricaReserva {

	public Reserva crear(ComandoReserva comandoReserva) {
		return new Reserva(comandoReserva.getIdReserva(),
				comandoReserva.getCliente(), comandoReserva.getVideojuego());
	}
}
