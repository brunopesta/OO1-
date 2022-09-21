package ar.edu.unlp.info.oo1.ejercicio8;


import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo () {
		
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public double costoEnBaseA(double precio) {
		return (this.consumoEnergiaActiva * precio);
		
	}
	
	public double factorDePotencia() {
		return (this.consumoEnergiaActiva / Math.sqrt(Math.pow(this.consumoEnergiaActiva,2) + (Math.pow(this.consumoEnergiaReactiva,2))));
	}
}
