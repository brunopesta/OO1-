package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCajaDeAhorro {
	private CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach // Ponerle este @beforeach lo que hace, es que antes de cada test, indica que cual es el metodo que se tiene que ejecutar..
	public void setUp() { //por ejemplo, aca le avisamos a java que lo primero que tiene que hacer es ejecturar esta instanciacion.
		cajaDeAhorro = new CajaDeAhorro();	
	}
	
	@Test
	void testGetSaldo() {
		this.cajaDeAhorro.depositarMonto(100);
		assertEquals(98,this.cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testPuedeExtraer() {
		this.cajaDeAhorro.depositarMonto(100);
		assertEquals(false,this.cajaDeAhorro.puedeExtraer(97));
	}
	
	@Test
	void testTransferirCuenta() {
		this.cajaDeAhorro.depositarMonto(100);
		assertEquals(true,this.cajaDeAhorro.transferirCuenta(94,cajaDeAhorro));		
	}
	
	
}
