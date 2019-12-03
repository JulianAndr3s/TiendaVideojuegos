package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioListarClientes {
	
	private RepositorioCliente repositorioCliente;
	
	
    public ServicioListarClientes(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }
	
	public List<ClienteDTO> ejecutar() {
		return this.repositorioCliente.listarClientes();
	}
}
