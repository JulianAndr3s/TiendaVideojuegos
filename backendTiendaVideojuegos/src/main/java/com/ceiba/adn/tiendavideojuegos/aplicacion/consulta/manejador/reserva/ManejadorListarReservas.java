package com.ceiba.adn.tiendavideojuegos.aplicacion.consulta.manejador.reserva;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ReservaDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.reserva.ServicioListarReservas;

@Component
public class ManejadorListarReservas {
	
	private final ServicioListarReservas servicioListarReservas;
	
	public ManejadorListarReservas(ServicioListarReservas servicioListarReservas) {
		this.servicioListarReservas = servicioListarReservas;
	}
	
	public List<ReservaDTO> ejecutar(){
		return this.servicioListarReservas.ejecutar();
	}
}
