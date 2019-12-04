package com.ceiba.adn.tiendavideojuegos.dominio.excepcion;

public class ExcepcionGeneral extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public static String NO_EXISTE_CLIENTE_BUSCADO = "No existe cliente buscado con este Id.";

    public ExcepcionGeneral(String mensaje){
        super(mensaje);
    }
}
