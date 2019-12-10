package com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ReservaDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.reserva.ConvertirReserva;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ReservaEntidad;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioReservaJpa;

@Repository
public class RepositorioReservaPostgres implements RepositorioReserva {
	
	private RepositorioReservaJpa repositorioReservaJpa;
	private ConvertirReserva convertirReserva = new ConvertirReserva();
	
	public RepositorioReservaPostgres(RepositorioReservaJpa repositorioReservaJpa) {
		this.repositorioReservaJpa = repositorioReservaJpa;
	}

	@Override
	public void crearReserva(Reserva reserva) {
		ReservaEntidad reservaEntidad = convertirReserva.convertirReservaDominioAReservaEntidad(reserva);
		repositorioReservaJpa.save(reservaEntidad);
		
	}

	@Override
	public List<ReservaDTO> listarReservas() {
		List<ReservaEntidad> listaReservaEntidad = repositorioReservaJpa.findAll();
		List<ReservaDTO> listaReservaDTO = new ArrayList<>();
		return convertirReserva.convertirListaReservaEntidadAListaReserva(listaReservaEntidad, listaReservaDTO);
	}

	@Override
	public void eliminarReserva(Long idReserva) {
		repositorioReservaJpa.deleteById(idReserva);
	}
	
	

}
