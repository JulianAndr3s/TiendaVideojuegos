package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioActualizarCliente {
	
	private RepositorioCliente repositorioCliente;
	
	public ServicioActualizarCliente(RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	public void ejecutar(Cliente cliente, String cedula) {
		ClienteDTO clienteDTO = repositorioCliente.buscarPorCedula(cedula);
		if (clienteDTO != null) {
			cliente.setIdCliente(clienteDTO.getIdCliente());
			this.repositorioCliente.actualizarCliente(cliente);
		}
		else {
			throw new ExcepcionGeneral(ExcepcionGeneral.NO_EXISTE_CLIENTE_A_ACTUALIZAR);
		}
	}
}
