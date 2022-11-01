package ar.edu.unlp.info.oo1.ejercicio13;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double tamanio() {
		return this.getNombre().length();
	}
}
