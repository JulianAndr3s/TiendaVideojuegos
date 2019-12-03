package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;

class ClienteTest {

	private static final Long ID_CLIENTE = 1L;
	private static final String NOMBRE = "Julian";
	private static final String APELLIDO = "Botero";
	private static final String TELEFONO = "5666804";
	private static final String CORREO ="juanbo97@hotmail.com";
	private static final String CEDULA = "1036402404";
	private static final String ESTADO_ACTIVO = "Activo";
	private static final String ESTADO_INACTIVO = "Inactivo";
	
	@Test
	void crearClienteActivoTest() {
		
		//Arrange
		Cliente cliente = new ClienteTestDataBuilder().build();
		
		//Act
		cliente.setIdCliente(ID_CLIENTE);
		cliente.setNombre(NOMBRE);
		cliente.setApellido(APELLIDO);
		cliente.setTelefono(TELEFONO);
		cliente.setCorreo(CORREO);
		cliente.setCedula(CEDULA);
		cliente.setEstado(ESTADO_ACTIVO);
		
		//Assert
		Assertions.assertEquals(ID_CLIENTE, cliente.getIdCliente() );
		Assertions.assertEquals(NOMBRE, cliente.getNombre());
		Assertions.assertEquals(APELLIDO, cliente.getApellido());
		Assertions.assertEquals(TELEFONO,cliente.getTelefono());
		Assertions.assertEquals(CORREO, cliente.getCorreo());
		Assertions.assertEquals(CEDULA, cliente.getCedula());
		Assertions.assertEquals(ESTADO_ACTIVO, cliente.getEstado());
		
	}
	
	@Test
	void crearClienteInactivoTest() {
		
		//Arrange
		Cliente cliente = new ClienteTestDataBuilder().build();
		
		//Act
		cliente.setIdCliente(ID_CLIENTE);
		cliente.setNombre(NOMBRE);
		cliente.setApellido(APELLIDO);
		cliente.setTelefono(TELEFONO);
		cliente.setCorreo(CORREO);
		cliente.setCedula(CEDULA);
		cliente.setEstado(ESTADO_INACTIVO);
		
		//Assert
		Assertions.assertEquals(ID_CLIENTE, cliente.getIdCliente() );
		Assertions.assertEquals(NOMBRE, cliente.getNombre());
		Assertions.assertEquals(APELLIDO, cliente.getApellido());
		Assertions.assertEquals(TELEFONO,cliente.getTelefono());
		Assertions.assertEquals(CORREO, cliente.getCorreo());
		Assertions.assertEquals(CEDULA, cliente.getCedula());
		Assertions.assertEquals(ESTADO_INACTIVO, cliente.getEstado());
		
	}
	
	@Test
	void crearClienteConNombre() {
		
		// Arrange
		ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conNombre(NOMBRE);
		
		// Act
		Cliente cliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(NOMBRE, cliente.getNombre());
	}
	
	@Test
	void crearClienteConApellido() {
		
		// Arrange
		ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conApellido(APELLIDO);
		
		// Act
		Cliente cliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(APELLIDO, cliente.getApellido());
	}
	
	@Test
	void crearClienteConTelefono() {
		
		// Arrange
		ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conTelefono(TELEFONO);
		
		// Act
		Cliente cliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(TELEFONO, cliente.getTelefono());
	}
	
	@Test
	void crearClienteConCorreo() {
		
		// Arrange
		ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCorreo(CORREO);
		
		// Act
		Cliente cliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(CORREO, cliente.getCorreo());
	}
	
	@Test
	void crearClienteConCedula() {
		
		// Arrange
		ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCedula(CEDULA);
		
		// Act
		Cliente cliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(CEDULA, cliente.getCedula());
	}

}
