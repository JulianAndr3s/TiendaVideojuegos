package com.ceiba.adn.tiendavideojuegos.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioCrearVideojuego;

@Configuration
public class BeanServicioVideojuego {
	
	@Bean
	public ServicioCrearVideojuego servicioCrearVideojuego(RepositorioVideojuego repositorioVideojuego) {
		return new ServicioCrearVideojuego(repositorioVideojuego);
	}

}
