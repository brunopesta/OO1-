package ar.edu.unlp.info.oo1.ejercicio12;

public class Esfera extends Pieza {
	private double radio;
	
	
	public Esfera(double radio, String material, String color) {
		super(color, material);
		this.radio = radio;
	}

	@Override
	public double getVolumenDeMaterial() {
		return 1.33 * Math.PI * Math.pow(this.radio,3);
	}

	@Override
	public double getSuperficieDeColor() {
		return 4 * Math.PI * Math.pow(this.radio,2);
	}
	
}
