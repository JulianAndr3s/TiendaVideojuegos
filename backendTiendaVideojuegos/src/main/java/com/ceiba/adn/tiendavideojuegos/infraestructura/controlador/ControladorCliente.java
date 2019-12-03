package com.ceiba.adn.tiendavideojuegos.infraestructura.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;

@RestController
@RequestMapping(value = "/cliente")
public class ControladorCliente {
	
	private final ManejadorCrearCliente manejadorCrearCliente;
	
	public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente) {
		this.manejadorCrearCliente = manejadorCrearCliente;
	}
	
	@PostMapping("/crear")
	public void crearCliente(@RequestBody ComandoCliente comandoCliente) {
		this.manejadorCrearCliente.ejecutar(comandoCliente);
	}
	
}
