package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;

@Component
public class FabricaVideojuego {
	
	public Videojuego crear(ComandoVideojuego comandoVideojuego){
		return new Videojuego(comandoVideojuego.getIdVideojuego(), comandoVideojuego.getNombre(),
				comandoVideojuego.getGenero(), comandoVideojuego.getFechaLanzamiento(),
				comandoVideojuego.getPrecio(), comandoVideojuego.getAutor());
	}
}
