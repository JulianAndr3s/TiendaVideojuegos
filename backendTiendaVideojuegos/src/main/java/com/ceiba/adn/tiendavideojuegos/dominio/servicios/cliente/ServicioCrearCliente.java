package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {
	
	private RepositorioCliente repositorioCliente;
	

    public ServicioCrearCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }
	
	public void ejecutar(Cliente cliente) {
		this.repositorioCliente.crearCliente(cliente);
	}
}
