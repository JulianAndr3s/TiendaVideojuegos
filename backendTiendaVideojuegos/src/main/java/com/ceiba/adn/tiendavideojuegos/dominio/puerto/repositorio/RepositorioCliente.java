package com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;

public interface RepositorioCliente {
	
	void crearCliente(Cliente cliente);
	List<ClienteDTO> listarClientes();
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Long idCliente);
	
}
