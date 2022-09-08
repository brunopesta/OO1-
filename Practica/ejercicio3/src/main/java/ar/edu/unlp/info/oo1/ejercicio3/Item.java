package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private int cantidad;
	private String detalle;
	private double costoUnitario;
	
	
	public Item() {	
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String unDetalle) {
		this.detalle = unDetalle;
	}
	

	public Item detalle(String unDetalle) {
		this.detalle = unDetalle;
		return this;
	}
	
	public Item costoUnitario(double unCostoUnitario) {
		this.costoUnitario= unCostoUnitario;
		return this;
	}
	
	public Item cantidad(int unaCantidad) {
		this.cantidad = unaCantidad;
		return this;}
}
