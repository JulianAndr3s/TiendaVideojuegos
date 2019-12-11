package com.ceiba.adn.tiendavideojuegos.dominio.unitaria.validar;


import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.adn.tiendavideojuegos.dominio.excepcion.ExcepcionReglasNegocio;
import com.ceiba.adn.tiendavideojuegos.dominio.validar.ValidarLogicaNegocio;

class LogicaNegocioTest {
	
	public static final String VIDEOJUEGO_CON_CARACTERES = "GTA SanAndreas/*";
	public static final String VIDEOJUEGO_SIN_CARACTERES = "GTA SanAndreas";
	public static final Integer PORCENTAJE_DESCUENTO_SI_ES_MAYOR = 85;
	public static final Integer PORCENTAJE_DESCUENTO_SI_ES_MENOR = 95;
	public static final Integer PRECIO_MAYOR = 270000;
	public static final Integer PRECIO_MENOR = 200000;
	public static final Integer PRECIO_CON_DESCUENTO_MAYOR = 229500;
	public static final Integer PRECIO_CON_DESCUENTO_MENOR = 190000;
	public static final LocalDate DIA_QUE_NO_HAY_SERVICIO = LocalDate.of(2019, 12, 1);
	public static final LocalDate DIA_QUE_SI_HAY_SERVICIO = LocalDate.of(2019, 12, 2);
	
	@Test
	public void contieneCaracteresTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		int cantidadDeCaracteres = 0;				
		
		//Act
		cantidadDeCaracteres = validarLogica.cantidadCaracteresEspeciales(VIDEOJUEGO_CON_CARACTERES);
		
		//Assert
		Assertions.assertNotEquals(0, cantidadDeCaracteres);
	}
	
	@Test
	public void noContieneCaracteresTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		int cantidadDeCaracteres = 0;				
		
		//Act
		cantidadDeCaracteres = validarLogica.cantidadCaracteresEspeciales(VIDEOJUEGO_SIN_CARACTERES);
		
		//Assert
		Assertions.assertEquals(0, cantidadDeCaracteres);
	}
	
	@Test
	public void excepcionCaracteresTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		
		//Act - Assert
		Assertions.assertThrows(ExcepcionReglasNegocio.class,() -> {
			validarLogica.contieneCaracteresEspeciales(VIDEOJUEGO_CON_CARACTERES);
	    });
	}
	
	@Test 
	public void noExcepcionCaracteresTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		
		Assertions.assertDoesNotThrow(() -> {
			validarLogica.contieneCaracteresEspeciales(VIDEOJUEGO_SIN_CARACTERES);
	    });
	}
	
	@Test
	public void descuentoPrecioMayorTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		Integer precioTotal = 0;				
		
		//Act
		precioTotal = validarLogica.descuentoDependiendoPrecio(PRECIO_MAYOR);
				
		//Assert
		Assertions.assertEquals(PRECIO_CON_DESCUENTO_MAYOR, precioTotal);
	}
	
	@Test
	public void descuentoPrecioMenorTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		Integer precioTotal = 0;				
		
		//Act
		precioTotal = validarLogica.descuentoDependiendoPrecio(PRECIO_MENOR);
				
		//Assert
		Assertions.assertEquals(PRECIO_CON_DESCUENTO_MENOR, precioTotal);
	}
	
	@Test
	public void excepcionDiaServicioTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		
		//Act - Assert
		Assertions.assertThrows(ExcepcionReglasNegocio.class,() -> {
			validarLogica.fechaEsValida(DIA_QUE_NO_HAY_SERVICIO);
	    });
	}
	
	@Test 
	public void noExcepcionDiaServicioTest() {
		
		//Arrange
		ValidarLogicaNegocio validarLogica = new ValidarLogicaNegocio();
		
		Assertions.assertDoesNotThrow(() -> {
			validarLogica.fechaEsValida(DIA_QUE_SI_HAY_SERVICIO);
	    });
	}

}
