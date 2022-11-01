package ar.edu.unlp.info.oo1.ejercicio12;

public class PrismaRectangular extends Pieza {

	private double ladoMayor;
	private double ladoMenor;
	private double altura;

	public PrismaRectangular(String color, String material, double ladoMayor, double ladoMenor, double altura) {
		super(color, material);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public double getVolumenDeMaterial() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double getSuperficieDeColor() {
		return 2*(this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
}
