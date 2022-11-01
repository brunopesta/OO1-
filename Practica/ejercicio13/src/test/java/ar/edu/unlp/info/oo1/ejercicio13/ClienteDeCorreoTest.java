package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {

	private ClienteDeCorreo cli1;
	private Carpeta inbox;
	private Carpeta carp1;
	private Email em1;
	private Email em2;
	
	
	@BeforeEach
	void setUp() {
		this.inbox = new Carpeta ("imtheinbox");
		this.cli1 = new ClienteDeCorreo(this.inbox);
		this.carp1 = new Carpeta ("IhaveMails");
		this.em1 = new Email("soymail","1234");
		this.em2 = new Email("holanda","1234");
		this.cli1.recibirMail(em1);
	}
	
	@Test
	void testRecibirYMover() {
		this.cli1.recibirMail(em2);
		assertEquals(2,this.cli1.getInbox().verMails().size());
		this.cli1.mover(em1, inbox, carp1);
		assertEquals(1,this.cli1.getInbox().verMails().size());
		assertEquals(1,this.carp1.verMails().size());
	}
	
	
	@Test
	void testBuscar() {
		this.carp1.agregarMail(em2);
		this.cli1.agregarCarpeta(carp1);
		assertEquals(this.em1,this.cli1.buscar("1234"));
		assertEquals(this.em2,this.cli1.buscar("holanda"));
		assertNull(this.cli1.buscar("noestoy"));
	}
	
	@Test
	void espacioOcupado() {
		this.carp1.agregarMail(em2);
		this.cli1.agregarCarpeta(carp1);
		assertEquals(22,this.cli1.espacioOcupado());
	}
}
