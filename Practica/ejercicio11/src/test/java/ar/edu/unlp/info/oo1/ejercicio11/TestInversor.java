package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversor {

	
	 private Inversor inversor;
	    private Inversion inversion1;
	    private Inversion inversion2;
		
	   @BeforeEach
	    public void setUp() {
		this.inversor = new Inversor("Jujaju");
	    this.inversion1 = new InversionEnAcciones("BrunoPestana", 100, 240);
		this.inversion2 = new PlazoFijo(LocalDate.now(), 1000, 2);
	    }

	    @Test
	    public void testAgregarInversion() {
		this.inversor.addInversion(inversion1);
		this.inversor.addInversion(inversion2);
		assertEquals(2, this.inversor.getInversiones().size());
	    }
		
	    @Test
	    public void testValorActual() {
		this.inversor.addInversion(inversion1);
		assertEquals(24000, this.inversor.valorActual());
	    }
}
