package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioCrearVideojuego {

	private final RepositorioVideojuego repositorioVideojuego;
	
	public ServicioCrearVideojuego(RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(Videojuego videojuego) {
		if(repositorioVideojuego.existeVideojuego(videojuego)) {
			throw new ExcepcionGeneral(ExcepcionGeneral.YA_EXISTE_VIDEOJUEGO);
		}
		else {
			this.repositorioVideojuego.crearVideojuego(videojuego);
		}
	}
}
