package com.ceiba.adn.tiendavideojuegos.infraestructura.entidad;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "videojuego")
public class VideojuegoEntidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_videojuego")
	private Long idVideojuego;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "genero")
	private String genero;
	@Column(name = "fecha_lanzamiento")
	private LocalDate fechaLanzamiento;
	@Column(name = "precio")
	private Integer precio;
	@Column(name = "autor")
	private String autor;
	
	public VideojuegoEntidad(Long idVideojuego, String nombre, String genero, LocalDate fechaLanzamiento,
			Integer precio, String autor) {
		this.idVideojuego = idVideojuego;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaLanzamiento = fechaLanzamiento;
		this.precio = precio;
		this.autor = autor;
	}

	public VideojuegoEntidad() {
		
	}

	public Long getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
