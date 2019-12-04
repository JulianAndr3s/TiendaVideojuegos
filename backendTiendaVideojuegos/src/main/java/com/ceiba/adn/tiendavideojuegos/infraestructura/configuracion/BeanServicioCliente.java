package com.ceiba.adn.tiendavideojuegos.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioActualizarCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioListarClientes;

@Configuration
public class BeanServicioCliente {
	
	@Bean
	public ServicioCrearCliente servicioCrearCliente(RepositorioCliente repositorioCliente) {
		return new ServicioCrearCliente(repositorioCliente);
	}
	
	@Bean
	public ServicioListarClientes servicioListarCliente(RepositorioCliente repositorioCliente) {
		return new ServicioListarClientes(repositorioCliente);
	}
	
	@Bean
	public ServicioActualizarCliente servicioActualizarCliente(RepositorioCliente repositorioCliente) {
		return new ServicioActualizarCliente(repositorioCliente);
	}
}
