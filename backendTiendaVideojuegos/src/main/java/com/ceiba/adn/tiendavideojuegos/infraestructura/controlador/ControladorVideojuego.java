package com.ceiba.adn.tiendavideojuegos.infraestructura.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego.ManejadorCrearVideojuego;

@RestController
@RequestMapping(value = "/videojuego")
public class ControladorVideojuego {
	
	private final ManejadorCrearVideojuego manejadorCrearVideojuego;
	
	public ControladorVideojuego (ManejadorCrearVideojuego manejadorCrearVideojuego) {
		this.manejadorCrearVideojuego = manejadorCrearVideojuego;
	}
	
	@PostMapping("/crear")
	public void crearVideojuego(@RequestBody ComandoVideojuego comandoVideojuego) {
		this.manejadorCrearVideojuego.ejecutar(comandoVideojuego);
	}

}
