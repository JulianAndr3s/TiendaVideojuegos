package com.ceiba.adn.tiendavideojuegos.infraestructura.unitaria.entidad;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ClienteEntidad;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.infraestructura.entidad.ClienteEntidadTestDataBuilder;

class ClienteEntidadTest {
	
	private static final Long ID_CLIENTE = 1L;
	private static final String NOMBRE = "Julian";
	private static final String APELLIDO = "Botero";
	private static final String TELEFONO = "5666804";
	private static final String CORREO ="juanbo97@hotmail.com";
	private static final String CEDULA = "1036402404";
	private static final String ESTADO = "Activo";

	@Test
	void crearClienteEntidadTest() {
		
		//Arrange
		ClienteEntidad clienteEntidad = new ClienteEntidadTestDataBuilder().build();
		
		//Act
		clienteEntidad.setIdCliente(ID_CLIENTE);
		clienteEntidad.setNombre(NOMBRE);
		clienteEntidad.setApellido(APELLIDO);
		clienteEntidad.setTelefono(TELEFONO);
		clienteEntidad.setCorreo(CORREO);
		clienteEntidad.setCedula(CEDULA);
		clienteEntidad.setEstado(ESTADO);
		
		//Assert
		Assertions.assertEquals(ID_CLIENTE, clienteEntidad.getIdCliente() );
		Assertions.assertEquals(NOMBRE, clienteEntidad.getNombre());
		Assertions.assertEquals(APELLIDO, clienteEntidad.getApellido());
		Assertions.assertEquals(TELEFONO,clienteEntidad.getTelefono());
		Assertions.assertEquals(CORREO, clienteEntidad.getCorreo());
		Assertions.assertEquals(CEDULA, clienteEntidad.getCedula());
		Assertions.assertEquals(ESTADO, clienteEntidad.getEstado());
	}
	
	@Test
	void crearClienteEntidadConNombre() {
		
		// Arrange
		ClienteEntidadTestDataBuilder clienteEntidadTestDataBuilder = new ClienteEntidadTestDataBuilder().conNombre(NOMBRE);
		
		// Act
		ClienteEntidad clienteEntidad = clienteEntidadTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(NOMBRE, clienteEntidad.getNombre());
	}
	
	@Test
	void crearClienteEntidadConApellido() {
		
		// Arrange
		ClienteEntidadTestDataBuilder clienteEntidadTestDataBuilder = new ClienteEntidadTestDataBuilder().conApellido(APELLIDO);
		
		// Act
		ClienteEntidad clienteEntidad = clienteEntidadTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(APELLIDO, clienteEntidad.getApellido());
	}
	
	@Test
	void crearClienteEntidadConTelefono() {
		
		// Arrange
		ClienteEntidadTestDataBuilder clienteEntidadTestDataBuilder = new ClienteEntidadTestDataBuilder().conTelefono(TELEFONO);
		
		// Act
		ClienteEntidad clienteEntidad = clienteEntidadTestDataBuilder.build();
		
		// Assert
		Assertions.assertEquals(TELEFONO, clienteEntidad.getTelefono());
	}
	
	@Test
	void crearClienteEntidadConCorreo() {
		
		// Arrange
		ClienteEntidadTestDataBuilder clienteEntidadTestDataBuilder = new ClienteEntidadTestDataBuilder().conCorreo(CORREO);
		
		// Act
		ClienteEntidad clienteEntidad = clienteEntidadTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(CORREO, clienteEntidad.getCorreo());
	}
	
	@Test
	void crearClienteEntidadConCedula() {
		
		// Arrange
		ClienteEntidadTestDataBuilder clienteEntidadTestDataBuilder = new ClienteEntidadTestDataBuilder().conCedula(CEDULA);
		
		// Act
		ClienteEntidad clienteEntidad = clienteEntidadTestDataBuilder.build();
		
		// Assert
		Assertions.assertEquals(CEDULA, clienteEntidad.getCedula());
	}

}
