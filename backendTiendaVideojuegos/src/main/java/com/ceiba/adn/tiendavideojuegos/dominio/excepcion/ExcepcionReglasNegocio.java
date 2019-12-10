package com.ceiba.adn.tiendavideojuegos.dominio.excepcion;

public class ExcepcionReglasNegocio extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public static final String CONTIENE_CARACTERES_ESPECIALES = "El nombre del videojuego contiene caracteres especiales.";
	public static final String NO_AGREGAR_DOMINGOS = "No es posible agregar videojuegos el domingo.";
	
    public ExcepcionReglasNegocio(String mensaje){
        super(mensaje);
    }
}
