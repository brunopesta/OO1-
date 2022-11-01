package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private List <Email> mails;
	private String nombre;
	
	public Carpeta(String ajua) {
		this.mails = new ArrayList();
		this.nombre = ajua;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public List<Email> verMails() {
		return this.mails;
	}
	
	public void agregarMail(Email e) {
		this.mails.add(e);
	}
	
	public void removerMail(Email e) {
		this.mails.remove(e);
	}
	public Email buscar(String texto) {
		return this.mails.stream().filter(email -> email.contiene(texto)).findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return this.mails.stream().mapToDouble(email -> email.espacioOcupado()).sum();
	}
}
