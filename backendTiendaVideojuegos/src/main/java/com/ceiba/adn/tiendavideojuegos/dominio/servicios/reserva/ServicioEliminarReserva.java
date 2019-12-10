package com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioEliminarReserva {
	
	private final RepositorioReserva repositorioReserva;
	
	public ServicioEliminarReserva(RepositorioReserva repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	
	public void ejecutar(Long idReserva) {
		this.repositorioReserva.eliminarReserva(idReserva);
	}
}
