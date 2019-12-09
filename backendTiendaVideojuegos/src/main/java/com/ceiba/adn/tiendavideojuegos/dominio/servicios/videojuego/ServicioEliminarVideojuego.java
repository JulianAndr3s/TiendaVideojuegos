package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioEliminarVideojuego {
	
	private final RepositorioVideojuego repositorioVideojuego;
	
	public ServicioEliminarVideojuego(RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(Long idVideojuego) {
		this.repositorioVideojuego.eliminarVideojuego(idVideojuego);
	}
}
