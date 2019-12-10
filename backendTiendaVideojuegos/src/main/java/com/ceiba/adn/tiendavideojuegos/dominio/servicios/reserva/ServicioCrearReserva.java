package com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioCrearReserva {
	
	private RepositorioReserva repositorioReserva;
	
	public ServicioCrearReserva(RepositorioReserva repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	
	public void ejecutar(Reserva reserva) {
		this.repositorioReserva.crearReserva(reserva);		
	}

}
