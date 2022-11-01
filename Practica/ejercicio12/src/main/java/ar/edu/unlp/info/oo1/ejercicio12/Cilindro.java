package ar.edu.unlp.info.oo1.ejercicio12;

public class Cilindro extends Pieza {
	private double radio;
	private double altura;

	public Cilindro(String color, String material, double radio, double altura) {
		super(color, material);
		this.altura = altura;
		this.radio = radio;
	}
	
	public double getVolumenDeMaterial() {
		return Math.PI * Math.pow(this.radio,2) * this.altura;
	}
	@Override
	public double getSuperficieDeColor() {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}
}
