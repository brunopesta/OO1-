package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestReporteDeConstruccion {

	
	protected ReporteDeConstruccion rep;
	protected Cilindro ci;
	protected Esfera es;
	protected PrismaRectangular pri;
	
	
	private void inicializate() {
		rep = new ReporteDeConstruccion();
		ci = new Cilindro("rosa","hierro",1,1);
		es = new Esfera(1,"rosa","hierro");
		pri = new PrismaRectangular("rosa","hierro",1,1,1);
	}
	
	@BeforeEach
	void setup() {
		this.inicializate();
	}
	
	@Test
	public void testInicial() {
		assertEquals(1,es.getVolumenDeMaterial());
		assertEquals(1,es.getSuperficieDeColor());
		assertEquals(1,ci.getSuperficieDeColor());
		assertEquals(1,ci.getVolumenDeMaterial());
		assertEquals(1,pri.getSuperficieDeColor());
		assertEquals(1,pri.getVolumenDeMaterial());
	}
}
