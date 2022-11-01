package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private List<Archivo> arch;
	private String titulo;
	private String cuerpo;
	
	public Email(String unTitulo, String unCuerpo) {
		this.arch = new ArrayList();
		this.cuerpo = unCuerpo;
		this.titulo = unTitulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
		
	}
	public void agregarAdjuntos(Archivo arc) {
		this.arch.add(arc);
	}
	
	public List<Archivo> archivos(){
		return this.arch;
	}
	
	public double espacioOcupado() {
		return (this.getTitulo().length()+this.getCuerpo().length()+this.arch.stream()
				.mapToDouble(archivo -> archivo.tamanio()).sum());
	}
	
	public boolean contiene(String texto) {
		return this.getCuerpo().contains(texto) || this.getTitulo().contains(texto);
	}
	
}
