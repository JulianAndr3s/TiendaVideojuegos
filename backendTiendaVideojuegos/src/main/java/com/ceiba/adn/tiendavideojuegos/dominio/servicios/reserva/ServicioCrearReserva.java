package com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioCrearReserva {
	
	private RepositorioReserva repositorioReserva;
	private RepositorioCliente repositorioCliente;
	private RepositorioVideojuego repositorioVideojuego;
	
	public ServicioCrearReserva(RepositorioReserva repositorioReserva,
			RepositorioCliente repositorioCliente, RepositorioVideojuego repositorioVideojuego) {
		this.repositorioReserva = repositorioReserva;
		this.repositorioCliente = repositorioCliente;
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(Reserva reserva) {
		ClienteDTO clienteDTO = repositorioCliente.buscarPorCedula(reserva.getCliente().getCedula());
		VideojuegoDTO videojuegoDTO = repositorioVideojuego.buscarPorNombre(reserva.getVideojuego().getNombre()); 
		reserva.setCliente(clienteDTO.construir());
		reserva.setVideojuego(videojuegoDTO.construir());
		this.repositorioReserva.crearReserva(reserva);		
	}
}
