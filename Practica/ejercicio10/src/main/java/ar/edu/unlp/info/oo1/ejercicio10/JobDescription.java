package ar.edu.unlp.info.oo1.ejercicio10;

public class JobDescription {
	private double effort;
	private int priority;
	private String description;
	
	public JobDescription(double unEsfuerzo, int unaPrioridad, String unDescription){ 
		this.effort = unEsfuerzo;
		this.priority = unaPrioridad;
		this.description = unDescription;
		
	}
		
	public int priority() {
		return this.priority;
	}
	
	public double effort() {
		return this.effort;
	}
	
	public String descrption() {
		return this.description;
	}
}
