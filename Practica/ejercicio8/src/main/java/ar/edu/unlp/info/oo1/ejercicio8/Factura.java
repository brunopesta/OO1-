package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Factura {

	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario user;

	
	public Factura (double monto, double desc, Usuario unUser) {
		this.montoEnergiaActiva = monto;
		this.descuento = desc;
		this.user = unUser;
	}



	public double getDescuento() {
		return this.descuento;
	}

	public Date getFecha() {
		return this.fecha;
	}
	
	public Usuario getUsuario() {
		return this.user;
	}
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}

	public double montoTotal() {
		return (this.montoEnergiaActiva - this.descuento);
	}
}