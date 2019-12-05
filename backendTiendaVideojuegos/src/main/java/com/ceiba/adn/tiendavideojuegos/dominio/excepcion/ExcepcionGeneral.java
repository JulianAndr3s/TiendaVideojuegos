package com.ceiba.adn.tiendavideojuegos.dominio.excepcion;

public class ExcepcionGeneral extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public static final String NO_EXISTE_CLIENTE = "No existe cliente con este Id.";
	public static final String NO_EXISTE_CLIENTE_A_ACTUALIZAR = "No existe cliente a actualizar.";
	public static final String YA_EXISTE_CLIENTE = "Ya existe cliente con este documento.";
	
    public ExcepcionGeneral(String mensaje){
        super(mensaje);
    }
}
