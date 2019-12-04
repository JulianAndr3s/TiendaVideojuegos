package com.ceiba.adn.tiendavideojuegos.dominio.excepcion;

public class ExcepcionReglasNegocio extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

    public ExcepcionReglasNegocio(String mensaje){
        super(mensaje);
    }
}
