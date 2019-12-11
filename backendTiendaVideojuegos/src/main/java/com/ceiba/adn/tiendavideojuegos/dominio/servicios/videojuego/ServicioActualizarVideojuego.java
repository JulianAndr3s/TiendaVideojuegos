package com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;

public class ServicioActualizarVideojuego {
	
	private RepositorioVideojuego repositorioVideojuego;
	
	public ServicioActualizarVideojuego (RepositorioVideojuego repositorioVideojuego) {
		this.repositorioVideojuego = repositorioVideojuego;
	}
	
	public void ejecutar(Videojuego videojuego) {
		if(repositorioVideojuego.existeVideojuego(videojuego)) {
			this.repositorioVideojuego.actualizarVideojuego(videojuego);
		}
		else {
			throw new ExcepcionGeneral(ExcepcionGeneral.NO_EXISTE_VIDEOJUEGO_A_ACTUALIZAR);
		}
	}
}
