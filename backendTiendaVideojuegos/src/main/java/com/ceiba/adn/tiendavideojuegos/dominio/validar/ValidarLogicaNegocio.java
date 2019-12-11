package com.ceiba.adn.tiendavideojuegos.dominio.validar;

import java.time.LocalDate;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionReglasNegocio;

public class ValidarLogicaNegocio {
	
	public static final Integer PORCENTAJE_DESCUENTO_SI_ES_MAYOR = 85;
	public static final Integer PORCENTAJE_DESCUENTO_SI_ES_MENOR = 95;
	public static final String DIA_QUE_NO_HAY_SERVICIO = "SUNDAY";
	
	public int cantidadCaracteresEspeciales(String nombreVideojuego) {
		int contadorCaracteres = 0;
    	nombreVideojuego = nombreVideojuego.toLowerCase();
    	for(int i = 0; i < nombreVideojuego.length(); i++) {
    		if ((nombreVideojuego.charAt(i) == '*') || (nombreVideojuego.charAt(i) == '/') || 
    				(nombreVideojuego.charAt(i) == '+')) {
    			contadorCaracteres ++;
    		}
    	}
    	return contadorCaracteres;
	}
	
	public void contieneCaracteresEspeciales(String nombreVideojuego) {
		int contieneCaracteres = cantidadCaracteresEspeciales(nombreVideojuego);
		if (contieneCaracteres != 0) {
			throw new ExcepcionReglasNegocio(ExcepcionReglasNegocio.CONTIENE_CARACTERES_ESPECIALES);
		}
	}
	
	public Integer descuentoDependiendoPrecio(Integer precio) {
		if (precio > 250000) {
			return (precio * PORCENTAJE_DESCUENTO_SI_ES_MAYOR) / 100;
		}
		else {
			return (precio * PORCENTAJE_DESCUENTO_SI_ES_MENOR) / 100;
		}
	}
	
	public void fechaEsValida(LocalDate fechaLanzamiento) {
		 String diaSemana = fechaLanzamiento.getDayOfWeek().toString();
		 if (diaSemana.equals(DIA_QUE_NO_HAY_SERVICIO)) {
			 throw new ExcepcionReglasNegocio(ExcepcionReglasNegocio.NO_AGREGAR_DOMINGOS);
		 } 
	}
	
	
}
