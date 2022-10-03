package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	List<Inversion> invesores;
	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.invesores = new ArrayList<>();
	}
	
	public void addInversion (Inversion inver) {
		this.invesores.add(inver);
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	 public double valorActual() {
	        return this.invesores.stream().mapToDouble(Inversion::valorActual).sum();
	    }
	
	public List<Inversion> getInversiones(){
		return this.invesores;
	}
}
