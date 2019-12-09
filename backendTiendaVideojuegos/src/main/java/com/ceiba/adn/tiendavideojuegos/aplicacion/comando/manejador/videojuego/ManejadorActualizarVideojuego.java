package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica.FabricaVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioActualizarVideojuego;

@Component
public class ManejadorActualizarVideojuego {
	
	private final ServicioActualizarVideojuego servicioActualizarVideojuego;
	private final FabricaVideojuego fabricaVideojuego;
	
	public ManejadorActualizarVideojuego(ServicioActualizarVideojuego servicioActualizarVideojuego,
			FabricaVideojuego fabricaVideojuego) {
		this.servicioActualizarVideojuego = servicioActualizarVideojuego;
		this.fabricaVideojuego = fabricaVideojuego;		
	}
	
	public void ejecutar(ComandoVideojuego comandoVideojuego, Long idVideojuego) {
		Videojuego videojuego = this.fabricaVideojuego.crear(comandoVideojuego);
		videojuego.setIdVideojuego(idVideojuego);
		this.servicioActualizarVideojuego.ejecutar(videojuego);
	}
}
