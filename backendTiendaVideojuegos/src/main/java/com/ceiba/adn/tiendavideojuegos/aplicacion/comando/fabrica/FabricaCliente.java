package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;

@Component
public class FabricaCliente {
	
	public Cliente crear(ComandoCliente comandoCliente) {
		return new Cliente(comandoCliente.getIdCliente(), comandoCliente.getNombre(),
				comandoCliente.getApellido(), comandoCliente.getTelefono(), 
				comandoCliente.getCorreo(), comandoCliente.getCedula(), comandoCliente.getEstado());
	}

}
