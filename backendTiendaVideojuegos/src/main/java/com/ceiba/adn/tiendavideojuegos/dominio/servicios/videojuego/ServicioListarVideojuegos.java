package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioListarVideojuegos {
	
private final RepositorioVideojuego repositorioVideojuego;
	
	public ServicioListarVideojuegos(RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public List<VideojuegoDTO> ejecutar() {
		return this.repositorioVideojuego.listarVideojuegos();
	}
}
