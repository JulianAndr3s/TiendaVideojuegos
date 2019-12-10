package com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ReservaEntidad;

@Repository
public interface RepositorioReservaJpa extends JpaRepository<ReservaEntidad, Serializable> {

}
