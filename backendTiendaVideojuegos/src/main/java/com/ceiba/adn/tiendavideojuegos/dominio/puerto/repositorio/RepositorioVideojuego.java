package com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;

public interface RepositorioVideojuego {
	
	void crearVideojuego(Videojuego videojuego);
	List<VideojuegoDTO> listarVideojuegos();
	void actualizarVideojuego(Videojuego videojuego);
	void eliminarVideojuego(Long idVideojuego);
	VideojuegoDTO buscarPorId(Long idVideojuego);
	boolean existeVideojuego(Videojuego videojuego);
	VideojuegoDTO buscarPorNombre(String nombreVideojuego);
}
