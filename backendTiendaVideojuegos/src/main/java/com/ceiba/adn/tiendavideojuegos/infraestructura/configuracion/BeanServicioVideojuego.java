package com.ceiba.adn.tiendavideojuegos.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioActualizarVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioCrearVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioEliminarVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioListarVideojuegos;

@Configuration
public class BeanServicioVideojuego {
	
	@Bean
	public ServicioCrearVideojuego servicioCrearVideojuego(RepositorioVideojuego repositorioVideojuego) {
		return new ServicioCrearVideojuego(repositorioVideojuego);
	}
	
	@Bean
	public ServicioListarVideojuegos servicioListarVideojuegos(RepositorioVideojuego repositorioVideojuego) {
		return new ServicioListarVideojuegos(repositorioVideojuego);
	}
	
	@Bean
	public ServicioActualizarVideojuego servicioActualizarVideojuego(RepositorioVideojuego repositorioVideojuego) {
		return new ServicioActualizarVideojuego(repositorioVideojuego);
	}
	
	@Bean
	public ServicioEliminarVideojuego servicioEliminarVideojuego(RepositorioVideojuego repositorioVideojuego) {
		return new ServicioEliminarVideojuego(repositorioVideojuego);
	}

}
