package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioEliminarVideojuego;

@Component
public class ManejadorEliminarVideojuego {
	
	private final ServicioEliminarVideojuego servicioEliminarVideojuego;
	
	public ManejadorEliminarVideojuego(ServicioEliminarVideojuego servicioEliminarVideojuego) {
		this.servicioEliminarVideojuego = servicioEliminarVideojuego;	
	}
	
	public void ejecutar(String nombreVideojuego) {
		this.servicioEliminarVideojuego.ejecutar(nombreVideojuego);
	}
}
