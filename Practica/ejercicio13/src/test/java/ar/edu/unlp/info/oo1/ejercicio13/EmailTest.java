package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	private Email mailconarch;
	private Email mailsinarch;
	private Archivo arch1;
	private Archivo arch2;


	@BeforeEach
	void setUp() throws Exception{
		this.mailconarch = new Email("soymail","123");
		this.mailsinarch = new Email("soy","123");
		this.arch1 = new Archivo ("El duko");
		this.arch2 = new Archivo("elYSYA");
	}
	
	@Test
	void testConstructor() {
		assertEquals("soymail",this.mailconarch.getTitulo());
		assertEquals("123",this.mailconarch.getCuerpo());
		assertNotNull(this.mailconarch.archivos());
	}
	
	@Test
	void testEspacioOcupado() {
		this.mailconarch.agregarAdjuntos(arch1);
		this.mailconarch.agregarAdjuntos(arch2);
		assertEquals(23.00,this.mailconarch.espacioOcupado());
		assertEquals(6.00,this.mailsinarch.espacioOcupado());
	}
	@Test
	void contiene() {
		assertTrue(this.mailconarch.contiene("123"));
		assertFalse(this.mailsinarch.contiene("algo"));
	}
}

