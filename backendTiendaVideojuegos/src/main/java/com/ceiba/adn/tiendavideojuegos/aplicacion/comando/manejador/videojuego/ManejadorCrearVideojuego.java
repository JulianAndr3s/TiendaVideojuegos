package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.videojuego;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica.FabricaVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioCrearVideojuego;

@Component
public class ManejadorCrearVideojuego {
	
	private final ServicioCrearVideojuego servicioCrearVideojuego;
	private final FabricaVideojuego fabricaVideojuego;
	
	public ManejadorCrearVideojuego(ServicioCrearVideojuego servicioCrearVideojuego,
			FabricaVideojuego fabricaVideojuego) {
		this.servicioCrearVideojuego = servicioCrearVideojuego;
		this.fabricaVideojuego = fabricaVideojuego;		
	}
	
	public void ejecutar(ComandoVideojuego comandoVideojuego) {
		Videojuego videojuego = this.fabricaVideojuego.crear(comandoVideojuego);
		this.servicioCrearVideojuego.ejecutar(videojuego);
	}

}
