package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza>piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList();
	}
	
	public void addPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double volumenDeMaterial(String material){
		return this.piezas.stream().filter(m -> m.getMaterial().equals(material)).mapToDouble(Pieza::getVolumenDeMaterial).sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().filter(m -> m.getColor().equals(color)).mapToDouble(Pieza::getSuperficieDeColor).sum();
	}
}
