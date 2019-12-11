package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.cliente;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioActualizarCliente;

@Component
public class ManejadorActualizarCliente {
	
	private final ServicioActualizarCliente servicioActualizarCliente;
	private final FabricaCliente fabricaCliente;
	
	public ManejadorActualizarCliente(ServicioActualizarCliente servicioActualizarCliente, FabricaCliente fabricaCliente) {
		this.servicioActualizarCliente = servicioActualizarCliente;
		this.fabricaCliente = fabricaCliente;
	}
	
	public void ejecutar(ComandoCliente comandoCliente, Long idCliente) {
		Cliente cliente = this.fabricaCliente.crear(comandoCliente);
		cliente.setIdCliente(idCliente);
		this.servicioActualizarCliente.ejecutar(cliente);
	}
}
