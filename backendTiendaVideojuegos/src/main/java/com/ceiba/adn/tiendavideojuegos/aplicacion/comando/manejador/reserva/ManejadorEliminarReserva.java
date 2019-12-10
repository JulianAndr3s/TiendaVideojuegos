package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.reserva;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioEliminarReserva;

@Component
public class ManejadorEliminarReserva {
	
	private final ServicioEliminarReserva servicioEliminarReserva;
	
	public ManejadorEliminarReserva (ServicioEliminarReserva servicioEliminarReserva) {
		this.servicioEliminarReserva = servicioEliminarReserva;
	}
	
	public void ejecutar(Long idReserva) {
		this.servicioEliminarReserva.ejecutar(idReserva);
	}
}
