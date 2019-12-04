package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.servicios.cliente;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.servicios.cliente.ServicioEliminarCliente;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteDTOTestDataBuilder;

class ServiciosClienteTest {

	@Test
	void servicioEliminarClienteTest() {
		
		//Arrange
		RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();
		when(repositorioCliente.buscarPorId(clienteDTO.getIdCliente())).thenReturn(null);
		ServicioEliminarCliente servicioEliminarCliente = new ServicioEliminarCliente(repositorioCliente);
		
		//Act - Assert
		ExcepcionGeneral thrown = Assertions.assertThrows(ExcepcionGeneral.class, () -> 
		servicioEliminarCliente.ejecutar(clienteDTO.getIdCliente()),
		"No existe cliente buscado con este Id.");
		
		Assertions.assertTrue(thrown.getMessage().contentEquals("No existe cliente buscado con este Id."));
	}
}
