package com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ClienteEntidad;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioClienteJpa;

@Repository
public class RepositorioClienteImpl implements RepositorioCliente {

	private ModelMapper modelMapper = new ModelMapper();
	private RepositorioClienteJpa repositorioClienteJpa;
	
	public RepositorioClienteImpl (RepositorioClienteJpa repositorioClienteJpa) {
		this.repositorioClienteJpa = repositorioClienteJpa;
	}
	
	@Override
	public void crearCliente(Cliente cliente) {
		ClienteEntidad clienteEntidad = modelMapper.map(cliente, ClienteEntidad.class);
		repositorioClienteJpa.save(clienteEntidad);
	}
}
