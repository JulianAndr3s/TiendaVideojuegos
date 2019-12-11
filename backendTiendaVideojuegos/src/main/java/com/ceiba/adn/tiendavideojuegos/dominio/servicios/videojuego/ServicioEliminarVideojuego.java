package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioEliminarVideojuego {
	
	private final RepositorioVideojuego repositorioVideojuego;
	
	public ServicioEliminarVideojuego(RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(String nombreVideojuego) {
		VideojuegoDTO videojuegoDTO = repositorioVideojuego.buscarPorNombre(nombreVideojuego);
		this.repositorioVideojuego.eliminarVideojuego(videojuegoDTO.getIdVideojuego());
	}
}
