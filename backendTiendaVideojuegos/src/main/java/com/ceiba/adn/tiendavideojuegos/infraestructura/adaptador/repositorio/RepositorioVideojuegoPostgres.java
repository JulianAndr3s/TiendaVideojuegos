package com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.videojuego.ConvertirVideojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.VideojuegoEntidad;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioVideojuegoJpa;

@Repository
public class RepositorioVideojuegoPostgres implements RepositorioVideojuego {
	
	private ModelMapper modelMapper = new ModelMapper();

	private RepositorioVideojuegoJpa repositorioVideojuegoJpa;
	
	private ConvertirVideojuego convertirVideojuego = new ConvertirVideojuego();
	
	public RepositorioVideojuegoPostgres(RepositorioVideojuegoJpa repositorioVideojuegoJpa) {
		this.repositorioVideojuegoJpa = repositorioVideojuegoJpa;
	}
	
	@Override
	public void crearVideojuego(Videojuego videojuego) {
		VideojuegoEntidad videojuegoEntidadCrear = modelMapper.map(videojuego, VideojuegoEntidad.class);
		repositorioVideojuegoJpa.save(videojuegoEntidadCrear);
	}
}
