package com.ceiba.adn.tiendavideojuegos.aplicacion.consulta.manejador.videojuego;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.videojuego.ServicioListarVideojuegos;

@Component
public class ManejadorListarVideojuegos {
	
	private final ServicioListarVideojuegos servicioListarVideojuegos;
	
	public ManejadorListarVideojuegos (ServicioListarVideojuegos servicioListarVideojuegos) {
		this.servicioListarVideojuegos = servicioListarVideojuegos;
	}
	
	public List<VideojuegoDTO> ejecutar(){
		return this.servicioListarVideojuegos.ejecutar();
	}

}
