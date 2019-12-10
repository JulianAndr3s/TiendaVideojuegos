package com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ReservaDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioListarReservas {
	
	private final RepositorioReserva repositorioReserva;
	
	public ServicioListarReservas(RepositorioReserva repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	
	public List<ReservaDTO> ejecutar(){
		return this.repositorioReserva.listarReservas();
	}

}
