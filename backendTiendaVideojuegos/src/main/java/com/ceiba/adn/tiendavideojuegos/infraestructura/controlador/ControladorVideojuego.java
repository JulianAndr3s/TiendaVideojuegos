package com.ceiba.adn.tiendavideojuegos.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego.ManejadorActualizarVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego.ManejadorCrearVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego.ManejadorEliminarVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.consulta.manejador.videojuego.ManejadorListarVideojuegos;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;

@RestController
@RequestMapping(value = "/videojuego")
public class ControladorVideojuego {
	
	private final ManejadorCrearVideojuego manejadorCrearVideojuego;
	private final ManejadorListarVideojuegos manejadorListarVideojuegos;
	private final ManejadorEliminarVideojuego manejadorEliminarVideojuego;
	private final ManejadorActualizarVideojuego manejadorActualizarVideojuego;
	
	public ControladorVideojuego (ManejadorCrearVideojuego manejadorCrearVideojuego,
			ManejadorListarVideojuegos manejadorListarVideojuegos, 
			ManejadorEliminarVideojuego manejadorEliminarVideojuego,
			ManejadorActualizarVideojuego manejadorActualizarVideojuego) {
		this.manejadorCrearVideojuego = manejadorCrearVideojuego;
		this.manejadorActualizarVideojuego = manejadorActualizarVideojuego;
		this.manejadorEliminarVideojuego = manejadorEliminarVideojuego;
		this.manejadorListarVideojuegos = manejadorListarVideojuegos;
	}
	
	@PostMapping("/crear")
	public void crearVideojuego(@RequestBody ComandoVideojuego comandoVideojuego) {
		this.manejadorCrearVideojuego.ejecutar(comandoVideojuego);
	}
	
	@GetMapping("/listar")
	public List<VideojuegoDTO> listarVideojuegos() {
		return this.manejadorListarVideojuegos.ejecutar();
	}
	
	@PutMapping("/{idVideojuego}/actualizar")
	public void actualizarVideojuego(@RequestBody ComandoVideojuego comandoVideojuego,
			@PathVariable Long idVideojuego) {
		this.manejadorActualizarVideojuego.ejecutar(comandoVideojuego, idVideojuego);
	}
	
	@DeleteMapping("/{idVideojuego}/eliminar")
	public void eliminarVideojuego(@PathVariable Long idVideojuego) {
		this.manejadorEliminarVideojuego.ejecutar(idVideojuego);		
	}

}
