package com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ReservaDTO;

public interface RepositorioReserva {
	
	void crearReserva(Reserva reserva);
	List<ReservaDTO> listarReservas();
	void eliminarReserva(Long idReserva);

}
