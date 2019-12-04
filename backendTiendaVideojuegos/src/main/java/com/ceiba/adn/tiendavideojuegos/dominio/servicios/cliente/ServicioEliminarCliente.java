package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

	private final RepositorioCliente repositorioCliente;
	
	public ServicioEliminarCliente (RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	public void ejecutar(Long idCliente) {
		this.repositorioCliente.eliminarCliente(idCliente);
	}
	
}
