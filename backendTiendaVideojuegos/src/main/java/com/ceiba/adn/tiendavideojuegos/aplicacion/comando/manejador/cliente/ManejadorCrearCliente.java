package com.ceiba.adn.tiendavideojuegos.aplicacion.comando.manejador.cliente;

import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioCrearCliente;

@Component
public class ManejadorCrearCliente {
	
	private final ServicioCrearCliente servicioCrearCliente;
	private final FabricaCliente fabricaCliente;
	
	public ManejadorCrearCliente(ServicioCrearCliente servicioCrearCliente, FabricaCliente fabricaCliente) {
        this.servicioCrearCliente = servicioCrearCliente;
        this.fabricaCliente = fabricaCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = this.fabricaCliente.crear(comandoCliente);
        this.servicioCrearCliente.ejecutar(cliente);
    }
}
