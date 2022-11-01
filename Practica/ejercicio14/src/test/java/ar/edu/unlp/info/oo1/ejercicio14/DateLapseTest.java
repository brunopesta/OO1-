package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	private LocalDate from;
	private LocalDate to;
	private DateLapse obj;
	private DateLapse2 obj2;
	
	
	@BeforeEach
	void setUp() {
		this.from= LocalDate.of(2020, 1, 4);
		this.to =LocalDate.of(2020, 2, 4);
		this.obj = new DateLapse(from,to);
		this.obj2 = new DateLapse2(from,10);
	}
	
	@Test
	void testConstructor() {
		assertEquals(LocalDate.of(2020, 2, 4),this.obj.getTo());
		assertEquals(LocalDate.of(2020, 1, 4),this.obj.getFrom());
		assertEquals(10,this.obj2.sizeInDays());
		assertEquals(LocalDate.of(2020, 1, 4),this.obj2.getFrom());
	}
	
	@Test
	void distancia() {
		assertEquals(1,this.obj.sizeInDays());
		assertEquals(10,this.obj2.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		assertFalse(this.obj.includesDate(this.from));
		assertTrue(this.obj.includesDate(LocalDate.of(2020, 2, 1)));
		assertFalse(this.obj2.includesDate(this.from));
		assertTrue(this.obj2.includesDate(LocalDate.of(2020, 1, 5)));
	}
}