package com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.videojuego.ConvertirVideojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.VideojuegoEntidad;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioVideojuegoJpa;

@Repository
public class RepositorioVideojuegoPostgres implements RepositorioVideojuego {

	private RepositorioVideojuegoJpa repositorioVideojuegoJpa;
	
	private ConvertirVideojuego convertirVideojuego = new ConvertirVideojuego();
		
	public RepositorioVideojuegoPostgres(RepositorioVideojuegoJpa repositorioVideojuegoJpa) {
		this.repositorioVideojuegoJpa = repositorioVideojuegoJpa;
	}
	
	@Override
	public void crearVideojuego(Videojuego videojuego) {
		VideojuegoEntidad videojuegoEntidadCrear = convertirVideojuego.convertirVideojuegoDominioAVideojuegoEntidad(videojuego);
		repositorioVideojuegoJpa.save(videojuegoEntidadCrear);
	}

	@Override
	public List<VideojuegoDTO> listarVideojuegos() {
		List<VideojuegoEntidad> listaVideojuegosEntidad = repositorioVideojuegoJpa.findAll();
		List<VideojuegoDTO> listaVideojuegosDTO = new ArrayList<>();
		return convertirVideojuego.convertirListaVideojuegoEntidadAListaVideojuego(listaVideojuegosEntidad, listaVideojuegosDTO);
	}

	@Override
	public void actualizarVideojuego(Videojuego videojuego) {
		VideojuegoEntidad videojuegoEntidadActualizar = convertirVideojuego.convertirVideojuegoDominioAVideojuegoEntidad(videojuego);
		repositorioVideojuegoJpa.save(videojuegoEntidadActualizar);		
	}

	@Override
	public void eliminarVideojuego(Long idVideojuego) {
		repositorioVideojuegoJpa.deleteById(idVideojuego);
	}

	@Override
	public VideojuegoDTO buscarPorId(Long idVideojuego) {
		VideojuegoEntidad videojuegoEntidad = repositorioVideojuegoJpa.findById(idVideojuego).orElse(null);
		return convertirVideojuego.convertirVideojuegoEntidadAVideojuegoDTO(videojuegoEntidad);
	}
}
