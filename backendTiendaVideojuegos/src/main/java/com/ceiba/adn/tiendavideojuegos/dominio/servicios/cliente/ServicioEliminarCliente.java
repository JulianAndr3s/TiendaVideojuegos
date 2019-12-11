package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

	private final RepositorioCliente repositorioCliente;
	
	public ServicioEliminarCliente (RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	public void ejecutar(String cedula) {
		ClienteDTO clienteDTO = repositorioCliente.buscarPorCedula(cedula);
		this.repositorioCliente.eliminarCliente(clienteDTO.getIdCliente());
	}
	
}
