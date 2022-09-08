package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo {
	private double radio;
	
	public Circulo() {
		
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	
	public double getRadio() {
	
		return this.radio;
	}
	
	public void setRadio(double unRadio){
		this.radio= unRadio;
	}
	
	public double getPerimetro() {
		return (Math.PI * this.getDiametro());
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(this.radio, 2));
	}
	}
 