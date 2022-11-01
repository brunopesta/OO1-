package ar.edu.unlp.info.oo1.ejercicio15;

public class Reserva {

	private Propiedad propiedad;
	private DateLapse periodo;
	
	
	public Reserva( DateLapse periodo, Propiedad prop) {
		this.propiedad = prop;
		this.periodo=periodo;
	}
	
	public double calcularReserva() {
		return (this.propiedad.getPrecio() * this.periodo.sizeInDays());
	}
	
	public boolean overlaps( DateLapse another) {
		return this.periodo.overlaps(another);
	}
	
	public boolean inicioPosteriorFechaActual() {
		return this.periodo.laterFrom();
	}
}
