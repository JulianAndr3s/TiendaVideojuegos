package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.reserva;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica.FabricaReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioCrearReserva;

@Component
public class ManejadorCrearReserva {

	private final ServicioCrearReserva servicioCrearReserva;
	private final FabricaReserva fabricaReserva;
	
	public ManejadorCrearReserva (ServicioCrearReserva servicioCrearReserva,
			FabricaReserva fabricaReserva) {
		this.servicioCrearReserva = servicioCrearReserva;
		this.fabricaReserva = fabricaReserva;
	}
	
	public void ejecutar (ComandoReserva comandoReserva) {
		Reserva reserva = this.fabricaReserva.crear(comandoReserva);
		this.servicioCrearReserva.ejecutar(reserva);
	}
}
