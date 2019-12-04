package com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;

public class ClienteDTOTestDataBuilder {
	
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
	
	public ClienteDTOTestDataBuilder() {
		this.idCliente = ID_CLIENTE;
		this.nombre = NOMBRE;
		this.apellido = APELLIDO;
		this.telefono = TELEFONO;
		this.correo = CORREO;
		this.cedula = CEDULA;
		this.estado = ESTADO;
	}
	
	public ClienteDTOTestDataBuilder conIdCliente(Long idCliente) {
		this.idCliente = idCliente;
		return this;
	}
	
	public ClienteDTOTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ClienteDTOTestDataBuilder conApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}
	
	public ClienteDTOTestDataBuilder conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	
	public ClienteDTOTestDataBuilder conCorreo(String correo) {
		this.correo = correo;
		return this;
	}
	
	public ClienteDTOTestDataBuilder conCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}
	
	public ClienteDTO build() {
		return new ClienteDTO(this.idCliente, this.nombre, this.apellido, this.telefono, 
				this.correo, this.cedula, this.estado);
	}

}
