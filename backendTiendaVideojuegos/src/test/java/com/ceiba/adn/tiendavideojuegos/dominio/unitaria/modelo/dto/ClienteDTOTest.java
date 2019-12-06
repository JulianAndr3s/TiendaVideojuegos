package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.modelo.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteDTOTestDataBuilder;

class ClienteDTOTest {
	
	private static final Long ID_CLIENTE = 1L;
	private static final String NOMBRE = "Julian Andres";
	private static final String APELLIDO = "Botero Henao";
	private static final String TELEFONO = "3204123372";
	private static final String CORREO ="juanbo97@hotmail.com";
	private static final String CEDULA = "1036402404";
	private static final String ESTADO_ACTIVO = "Activo";
	private static final String ESTADO_INACTIVO = "Inactivo";

	@Test
	void crearClienteDTOActivoTest() {
		
		//Arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();
		
		//Act
		clienteDTO.setIdClienteDTO(ID_CLIENTE);
		clienteDTO.setNombreDTO(NOMBRE);
		clienteDTO.setApellidoDTO(APELLIDO);
		clienteDTO.setTelefonoDTO(TELEFONO);
		clienteDTO.setCorreoDTO(CORREO);
		clienteDTO.setCedulaDTO(CEDULA);
		clienteDTO.setEstadoDTO(ESTADO_ACTIVO);
		
		//Assert
		Assertions.assertEquals(ID_CLIENTE, clienteDTO.getIdClienteDTO());
		Assertions.assertEquals(NOMBRE, clienteDTO.getNombreDTO());
		Assertions.assertEquals(APELLIDO, clienteDTO.getApellidoDTO());
		Assertions.assertEquals(TELEFONO,clienteDTO.getTelefonoDTO());
		Assertions.assertEquals(CORREO, clienteDTO.getCorreoDTO());
		Assertions.assertEquals(CEDULA, clienteDTO.getCedulaDTO());
		Assertions.assertEquals(ESTADO_ACTIVO, clienteDTO.getEstadoDTO());
	}
	
	@Test
	void crearClienteDTOInactivoTest() {

		//Arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();
		
		//Act
		clienteDTO.setIdClienteDTO(ID_CLIENTE);
		clienteDTO.setNombreDTO(NOMBRE);
		clienteDTO.setApellidoDTO(APELLIDO);
		clienteDTO.setTelefonoDTO(TELEFONO);
		clienteDTO.setCorreoDTO(CORREO);
		clienteDTO.setCedulaDTO(CEDULA);
		clienteDTO.setEstadoDTO(ESTADO_INACTIVO);
		
		//Assert
		Assertions.assertEquals(ID_CLIENTE, clienteDTO.getIdClienteDTO());
		Assertions.assertEquals(NOMBRE, clienteDTO.getNombreDTO());
		Assertions.assertEquals(APELLIDO, clienteDTO.getApellidoDTO());
		Assertions.assertEquals(TELEFONO,clienteDTO.getTelefonoDTO());
		Assertions.assertEquals(CORREO, clienteDTO.getCorreoDTO());
		Assertions.assertEquals(CEDULA, clienteDTO.getCedulaDTO());
		Assertions.assertEquals(ESTADO_INACTIVO, clienteDTO.getEstadoDTO());
	}
	
	

}
