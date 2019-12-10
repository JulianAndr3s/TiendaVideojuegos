package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;

public class ClienteDTO {
	
	private Long idClienteDTO;
	private String nombreDTO;
	private String apellidoDTO;
	private String telefonoDTO;
	private String correoDTO;
	private String cedulaDTO;
	private String estadoDTO;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Long idCliente, String nombre, String apellido, String telefono, String correo, String cedula,
			String estado) {
		super();
		this.idClienteDTO = idCliente;
		this.nombreDTO = nombre;
		this.apellidoDTO = apellido;
		this.telefonoDTO = telefono;
		this.correoDTO = correo;
		this.cedulaDTO = cedula;
		this.estadoDTO = estado;
	}

	public Long getIdCliente() {
		return idClienteDTO;
	}

	public void setIdCliente(Long idCliente) {
		this.idClienteDTO = idCliente;
	}

	public String getNombre() {
		return nombreDTO;
	}

	public void setNombre(String nombre) {
		this.nombreDTO = nombre;
	}

	public String getApellido() {
		return apellidoDTO;
	}
	
	public void setApellido(String apellido) {
		this.apellidoDTO = apellido;
	}

	public String getTelefono() {
		return telefonoDTO;
	}

	public void setTelefono(String telefono) {
		this.telefonoDTO = telefono;
	}

	public String getCorreo() {
		return correoDTO;
	}

	public void setCorreo(String correo) {
		this.correoDTO = correo;
	}

	public String getCedula() {
		return cedulaDTO;
	}

	public void setCedula(String cedula) {
		this.cedulaDTO = cedula;
	}

	public String getEstado() {
		return estadoDTO;
	}

	public void setEstado(String estado) {
		this.estadoDTO = estado;
	}
	
	public Cliente construir(){
		 return new Cliente(this.idClienteDTO,this.nombreDTO,this.apellidoDTO,
				 this.telefonoDTO,this.correoDTO,this.cedulaDTO,this.estadoDTO);
	 }
}
