package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.cliente;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioEliminarCliente;

@Component
public class ManejadorEliminarCliente {

	private final ServicioEliminarCliente servicioEliminarCliente;
	
	public ManejadorEliminarCliente (ServicioEliminarCliente servicioEliminarCliente) {
		this.servicioEliminarCliente = servicioEliminarCliente;
	}
	
	public void ejecutar(String cedula) {
		this.servicioEliminarCliente.ejecutar(cedula);
	}
	
}
