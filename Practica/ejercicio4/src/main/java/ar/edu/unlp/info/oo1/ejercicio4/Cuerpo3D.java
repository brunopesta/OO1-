package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {

	private double altura;
	private double caraB;
	private double perimetroCara;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(double unaAltura) {
		this.altura = unaAltura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Circulo c) {
		this.caraB = c.getArea();
		this.perimetroCara = c.getPerimetro();
	}
	
	public void setCaraBasal(Cuadrado cua) {
		this.caraB = cua.getArea();
		this.perimetroCara = cua.getPerimetro();
	}
	
	public double getVolumen() {
		return (this.caraB * this.altura);
	}

	public double getSuperficieExterior() {
		return 2*caraB + this.perimetroCara * this.getAltura();
	}
}
