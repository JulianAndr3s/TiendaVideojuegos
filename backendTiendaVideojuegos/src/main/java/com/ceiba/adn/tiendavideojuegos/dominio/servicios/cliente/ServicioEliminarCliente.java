package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;


import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

	private final RepositorioCliente repositorioCliente;
	
	public ServicioEliminarCliente (RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	public boolean ejecutar(Long idCliente) {
		ClienteDTO clienteDTO = repositorioCliente.buscarPorId(idCliente);
		if (clienteDTO != null) {
			this.repositorioCliente.eliminarCliente(idCliente);
			return true;
		}
		else {
			throw new ExcepcionGeneral(ExcepcionGeneral.NO_EXISTE_CLIENTE);
		}
	}
	
}
