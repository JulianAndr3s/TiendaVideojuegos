package com.ceiba.adn.tiendavideojuegos.aplicacion.unitaria.comando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando.ComandoClienteTestDataBuilder;



class ComandoClienteTest {
	
	private static final String NOMBRE = "Julian";
	private static final String APELLIDO = "Botero";
	private static final String TELEFONO = "5666804";
	private static final String CORREO ="juanbo97@hotmail.com";
	private static final String CEDULA = "1036402404";

	@Test
	void crearClienteConNombre() {
		// Arrange
		ComandoClienteTestDataBuilder clienteTestDataBuilder = new ComandoClienteTestDataBuilder().conNombre(NOMBRE);
		
		// Act
		ComandoCliente comandoCliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(NOMBRE, comandoCliente.getNombre());
	}
	
	@Test
	void crearClienteConApellido() {
		
		// Arrange
		ComandoClienteTestDataBuilder clienteTestDataBuilder = new ComandoClienteTestDataBuilder().conApellido(APELLIDO);
		
		// Act
		ComandoCliente comandoCliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(APELLIDO, comandoCliente.getApellido());
	}
	
	@Test
	void crearClienteConTelefono() {
		
		// Arrange
		ComandoClienteTestDataBuilder clienteTestDataBuilder = new ComandoClienteTestDataBuilder().conTelefono(TELEFONO);
		
		// Act
		ComandoCliente comandoCliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(TELEFONO, comandoCliente.getTelefono());
	}
	
	@Test
	void crearClienteConCorreo() {
		
		// Arrange
		ComandoClienteTestDataBuilder clienteTestDataBuilder = new ComandoClienteTestDataBuilder().conCorreo(CORREO);
		
		// Act
		ComandoCliente comandoCliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(CORREO, comandoCliente.getCorreo());
	}
	
	@Test
	void crearClienteConCedula() {
		
		// Arrange
		ComandoClienteTestDataBuilder clienteTestDataBuilder = new ComandoClienteTestDataBuilder().conCedula(CEDULA);
		
		// Act
		ComandoCliente comandoCliente = clienteTestDataBuilder.build();
		
		// Assert 
		Assertions.assertEquals(CEDULA, comandoCliente.getCedula());
	}
}
