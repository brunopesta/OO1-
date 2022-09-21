package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D implements Figura {

	private double altura;
	private Figura caraB;
	private double perimetroCara;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(double unaAltura) {
		this.altura = unaAltura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura f) {
		this.caraB = f.getArea();  
		this.perimetroCara = f.getPerimetro();
	}
	
	
	
	public double getVolumen() {
		return (this.caraB * this.altura);
	}

	public double getSuperficieExterior() {
		return 2*caraB + this.perimetroCara * this.getAltura();
	}
}
