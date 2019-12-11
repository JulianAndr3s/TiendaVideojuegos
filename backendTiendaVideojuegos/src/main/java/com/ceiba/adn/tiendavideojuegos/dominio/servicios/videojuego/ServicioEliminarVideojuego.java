package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioEliminarVideojuego {
	
	private final RepositorioVideojuego repositorioVideojuego;
	
	public ServicioEliminarVideojuego(RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(String nombreVideojuego) {
		VideojuegoDTO videojuegoDTO = repositorioVideojuego.buscarPorNombre(nombreVideojuego);
		if(videojuegoDTO != null) {
			this.repositorioVideojuego.eliminarVideojuego(videojuegoDTO.getIdVideojuego());
		}
		else {
			throw new ExcepcionGeneral(ExcepcionGeneral.NO_EXISTE_VIDEOJUEGO);
		}
	}
}
