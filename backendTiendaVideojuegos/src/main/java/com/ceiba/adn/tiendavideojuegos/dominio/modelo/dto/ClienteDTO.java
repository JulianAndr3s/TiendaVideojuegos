package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;

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

	public Long getIdClienteDTO() {
		return idClienteDTO;
	}

	public void setIdClienteDTO(Long idCliente) {
		this.idClienteDTO = idCliente;
	}

	public String getNombreDTO() {
		return nombreDTO;
	}

	public void setNombreDTO(String nombre) {
		this.nombreDTO = nombre;
	}

	public String getApellidoDTO() {
		return apellidoDTO;
	}

	public void setApellidoDTO(String apellido) {
		this.apellidoDTO = apellido;
	}

	public String getTelefonoDTO() {
		return telefonoDTO;
	}

	public void setTelefonoDTO(String telefono) {
		this.telefonoDTO = telefono;
	}

	public String getCorreoDTO() {
		return correoDTO;
	}

	public void setCorreoDTO(String correo) {
		this.correoDTO = correo;
	}

	public String getCedulaDTO() {
		return cedulaDTO;
	}

	public void setCedulaDTO(String cedula) {
		this.cedulaDTO = cedula;
	}

	public String getEstadoDTO() {
		return estadoDTO;
	}

	public void setEstadoDTO(String estado) {
		this.estadoDTO = estado;
	}
}
