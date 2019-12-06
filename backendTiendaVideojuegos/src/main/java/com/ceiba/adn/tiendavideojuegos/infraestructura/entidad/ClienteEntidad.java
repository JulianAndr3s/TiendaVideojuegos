package com.ceiba.adn.tiendavideojuegos.infraestructura.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class ClienteEntidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cliente")
	private Long idCliente;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "correo")
	private String correo;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "estado")
	private String estado;
	
	
	public ClienteEntidad() {
		
	}
	
	public ClienteEntidad(Long idCliente, String nombre, String apellido, String telefono, String correo, String cedula,
			String estado) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.cedula = cedula;
		this.estado = estado;
	}
}
