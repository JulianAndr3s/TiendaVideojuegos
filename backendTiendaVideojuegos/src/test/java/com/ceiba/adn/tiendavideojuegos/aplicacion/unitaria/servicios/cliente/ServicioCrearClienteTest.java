package com.ceiba.adn.tiendavideojuegos.aplicacion.unitaria.servicios.cliente;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;

class ServicioCrearClienteTest {
	
	private static final String NOMBRE_ESPERADO = "Julian";

	@Test
	void crearCliente() {
		//Arrange
		Cliente cliente = new ClienteTestDataBuilder().build();
		RepositorioCliente repositorioCliente = mock(RepositorioCliente.class);
		ServicioCrearCliente servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
		
		//Act
		servicioCrearCliente.ejecutar(cliente);
		
		//Assert
		Assertions.assertEquals(NOMBRE_ESPERADO, cliente.getNombre());	
	}

}
