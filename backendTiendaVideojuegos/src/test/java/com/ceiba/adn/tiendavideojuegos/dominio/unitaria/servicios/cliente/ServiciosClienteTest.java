package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.servicios.cliente;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioActualizarCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioEliminarCliente;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteDTOTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;

class ServiciosClienteTest {
	
	public static final String NO_EXISTE_CLIENTE_BUSCADO = "No existe cliente con este Id.";
	public static final String NO_EXISTE_CLIENTE_ACTUALIZAR = "No existe cliente a actualizar.";

	@Test
	void servicioEliminarClienteTest() {
		
		//Arrange
		RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();
		when(repositorioCliente.buscarPorId(clienteDTO.getIdClienteDTO())).thenReturn(null);
		ServicioEliminarCliente servicioEliminarCliente = new ServicioEliminarCliente(repositorioCliente);
		
		//Act - Assert
		ExcepcionGeneral excepcionTest = Assertions.assertThrows(ExcepcionGeneral.class, () -> 
		servicioEliminarCliente.ejecutar(clienteDTO.getIdClienteDTO()), NO_EXISTE_CLIENTE_BUSCADO);
		
		Assertions.assertTrue(excepcionTest.getMessage().contentEquals(NO_EXISTE_CLIENTE_BUSCADO));
	}
	
	@Test
	void servicioCrearClienteTest() {
		
		//Arrange
		RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
		Cliente cliente = new ClienteTestDataBuilder().build();
		when(repositorioCliente.buscarPorId(cliente.getIdCliente())).thenReturn(null);
		ServicioCrearCliente servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
		
		//Act
		boolean resultadoObtenido = servicioCrearCliente.ejecutar(cliente);
		
		//Assert
		Assertions.assertTrue(resultadoObtenido);
	}
	
	@Test
	void servicioActualizarClienteTest() {
		
		//Arrange
		RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
		Cliente cliente = new ClienteTestDataBuilder().build();
		when(repositorioCliente.buscarPorId(cliente.getIdCliente())).thenReturn(null);
		ServicioActualizarCliente servicioActualizarCliente = new ServicioActualizarCliente(repositorioCliente);
				
		//Act - Assert
		ExcepcionGeneral excepcionTest = Assertions.assertThrows(ExcepcionGeneral.class, () -> 
		servicioActualizarCliente.ejecutar(cliente), NO_EXISTE_CLIENTE_ACTUALIZAR);
		
		Assertions.assertTrue(excepcionTest.getMessage().contentEquals(NO_EXISTE_CLIENTE_ACTUALIZAR));
	}
}
