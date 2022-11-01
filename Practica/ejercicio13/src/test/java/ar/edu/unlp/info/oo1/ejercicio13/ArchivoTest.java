package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	private Archivo arch1;
	private String nombre;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.arch1 = new Archivo ("archivitomati");
		this.nombre = "elwason";
	}
	
	@Test
	void testConstructor() {
		assertEquals("archivitomati",this.arch1.getNombre());
		
	}
	
	@Test
	void testTamanio() {
		assertEquals(13.00,this.arch1.tamanio());	
		}
}
