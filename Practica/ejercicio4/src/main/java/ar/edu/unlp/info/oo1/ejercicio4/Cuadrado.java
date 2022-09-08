package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuadrado {

	private double lado;
	
	public Cuadrado() {
		
	}
	
	public void setLado(double unLado) {
		this.lado = unLado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return (this.getLado() * 4 );
	}
	
	public double getArea() {
		return (this.getLado() * this.getLado());
	}
	
}
