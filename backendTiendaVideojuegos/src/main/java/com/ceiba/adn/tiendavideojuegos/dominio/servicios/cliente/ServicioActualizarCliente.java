package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioActualizarCliente {
	
	private RepositorioCliente repositorioCliente;
	
	public ServicioActualizarCliente(RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	public void ejecutar(Cliente cliente) {
		if(repositorioCliente.existeCliente(cliente)) {
			this.repositorioCliente.actualizarCliente(cliente);
		}
	}
}
