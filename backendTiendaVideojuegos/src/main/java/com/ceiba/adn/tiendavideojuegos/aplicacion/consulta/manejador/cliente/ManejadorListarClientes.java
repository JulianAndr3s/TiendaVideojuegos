package com.ceiba.adn.tiendavideojuegos.aplicacion.consulta.manejador.cliente;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioListarClientes;

@Component
public class ManejadorListarClientes {
	
	private final ServicioListarClientes servicioListarCliente;
	
	public ManejadorListarClientes(ServicioListarClientes servicioListarCliente) {
        this.servicioListarCliente = servicioListarCliente;
    }

    public List<ClienteDTO> ejecutar(){
        return this.servicioListarCliente.ejecutar();
    }

}
