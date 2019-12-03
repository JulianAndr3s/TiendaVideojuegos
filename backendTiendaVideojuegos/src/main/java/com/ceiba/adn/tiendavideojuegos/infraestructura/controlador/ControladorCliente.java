package com.ceiba.adn.tiendavideojuegos.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.consulta.manejador.cliente.ManejadorListarClientes;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;

@RestController
@RequestMapping(value = "/cliente")
public class ControladorCliente {
	
	private final ManejadorCrearCliente manejadorCrearCliente;
	private final ManejadorListarClientes manejadorListarCliente;
	
	public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente,
			ManejadorListarClientes manejadorListarCliente) {
		this.manejadorCrearCliente = manejadorCrearCliente;
		this.manejadorListarCliente = manejadorListarCliente;
	}
	
	@PostMapping("/crear")
	public void crearCliente(@RequestBody ComandoCliente comandoCliente) {
		this.manejadorCrearCliente.ejecutar(comandoCliente);
	}
	
	@GetMapping("/listar")
	public List<ClienteDTO> listarClientes() {
		return this.manejadorListarCliente.ejecutar();
	}
}
