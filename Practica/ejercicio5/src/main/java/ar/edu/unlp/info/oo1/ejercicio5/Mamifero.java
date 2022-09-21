package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero madre;
	private Mamifero padre;

	public Mamifero() {
		
	}
	
	public Mamifero(String unId) {
		this.identificador = unId;
	}
	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getPadre() {
		return this.padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) {
			return this.getMadre().getPadre();	}
	
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
			return this.getMadre().getMadre();}
		
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null) {
			return this.getPadre().getPadre();}
		
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null) {
			return this.getPadre().getMadre();}

		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMami) {
		return ((this.getPadre() != null) && (this.getPadre().buscarAncestro(unMami))) || ((this.getMadre()!= null) && (this.getMadre().buscarAncestro(unMami)));
	}
	
	public boolean buscarAncestro(Mamifero unMamifero) {
		return this.equals(unMamifero) || this.tieneComoAncestroA(unMamifero);
}
	
}
