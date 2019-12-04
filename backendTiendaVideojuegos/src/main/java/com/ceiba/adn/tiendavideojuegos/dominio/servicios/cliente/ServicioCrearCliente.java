package com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {
	
	private RepositorioCliente repositorioCliente;
	

    public ServicioCrearCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }
	
	public void ejecutar(Cliente cliente) {
		if(repositorioCliente.buscarPorCedula(cliente.getCedula()) != null) {
			throw new ExcepcionGeneral(ExcepcionGeneral.YA_EXISTE_CLIENTE);
		}
		else {
			this.repositorioCliente.crearCliente(cliente);
		}
	}
}
