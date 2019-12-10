package com.ceiba.adn.tiendavideojuegos.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioCrearReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioEliminarReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioListarReservas;


@Configuration
public class BeanServicioReserva {

	@Bean
	public ServicioCrearReserva servicioCrearReserva(RepositorioReserva repositorioReserva) {
		return new ServicioCrearReserva(repositorioReserva);
	}
	
	@Bean
	public ServicioEliminarReserva servicioEliminarReserva(RepositorioReserva repositorioReserva) {
		return new ServicioEliminarReserva(repositorioReserva);
	}
	
	@Bean
	public ServicioListarReservas servicioListarReserva(RepositorioReserva repositorioReserva) {
		return new ServicioListarReservas(repositorioReserva);
	}
}
