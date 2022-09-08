package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket{

	private LocalDate fecha;
	private double pesoTot;
	private double precioTot;
	private int cantProd;
	
	public Ticket(int unCantProd, double unPesoTotal, double unPrecioTotal) {	
		this.cantProd = unCantProd;
		this.pesoTot = unPesoTotal;
		this.precioTot = unPrecioTotal;
		this.fecha= LocalDate.now();
	}
	
	public double impuesto() {
		return this.precioTot * 0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public List<>
// Innecesario. Ya lo ponemos en el constructor
//	public void setFecha(LocalDate fecha) {
//		this.fecha = fecha;
//	}

	public double getPesoTot() {
		return pesoTot;
	}

	public double getPrecioTot() {
		return precioTot;
	}

	public int getCantProd() {
		return cantProd;
	}

	
}
