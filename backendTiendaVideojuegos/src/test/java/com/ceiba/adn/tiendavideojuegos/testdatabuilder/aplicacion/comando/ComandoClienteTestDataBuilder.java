package com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando;

import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;

public class ComandoClienteTestDataBuilder {

	private static final Long ID_CLIENTE = 1L;
	private static final String NOMBRE = "Julian";
	private static final String APELLIDO = "Botero";
	private static final String TELEFONO = "5666804";
	private static final String CORREO ="juanbo97@hotmail.com";
	private static final String CEDULA = "1036402404";
	private static final String ESTADO = "Activo";
	
	private Long idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String cedula;
	private String estado;
	
	public ComandoClienteTestDataBuilder() {
		this.idCliente = ID_CLIENTE;
		this.nombre = NOMBRE;
		this.apellido = APELLIDO;
		this.telefono = TELEFONO;
		this.correo = CORREO;
		this.cedula = CEDULA;
		this.estado = ESTADO;
	}
	
	public ComandoClienteTestDataBuilder conIdCliente(Long idCliente) {
		this.idCliente = idCliente;
		return this;
	}
	
	public ComandoClienteTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoClienteTestDataBuilder conApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}
	
	public ComandoClienteTestDataBuilder conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	
	public ComandoClienteTestDataBuilder conCorreo(String correo) {
		this.correo = correo;
		return this;
	}
	
	public ComandoClienteTestDataBuilder conCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}
	
	public ComandoCliente build() {
		return new ComandoCliente(this.idCliente, this.nombre, this.apellido, this.telefono, 
				this.correo, this.cedula, this.estado);
	}
}
