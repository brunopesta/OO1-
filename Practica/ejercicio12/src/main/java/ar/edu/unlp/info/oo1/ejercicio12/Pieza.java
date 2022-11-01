package ar.edu.unlp.info.oo1.ejercicio12;

public abstract class Pieza {
	private String material;		
	private String color;
	
	public Pieza(String color, String material){
		this.color = color;
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	

	public abstract double getVolumenDeMaterial();
	
	public abstract double getSuperficieDeColor();

		
}
