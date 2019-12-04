package com.ceiba.adn.tiendavideojuegos.aplicacion.comando;

public class ComandoCliente {
	
	private Long idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String cedula;
	private String estado;
	
	public ComandoCliente (Long idCliente, String nombre, String apellido, 
			String telefono, String correo, String cedula, String estado) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.cedula = cedula;
		this.estado = estado;
	}
	
	
	public ComandoCliente() {
		
	}

	public Long getIdCliente() {
		return idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public String getCedula() {
		return cedula;
	}
	public String getEstado() {
		return estado;
	}
	
	
	

}
