package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private List <Carpeta> carp;
	private Carpeta inbox;
	public ClienteDeCorreo(Carpeta inbox) {
		this.carp = new ArrayList();
		this.inbox = inbox;	
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carp;
	}
	
	public void agregarCarpeta (Carpeta carpeta) {
		this.carp.add(carpeta);
	}
	
	public void recibirMail(Email e) {
		this.inbox.agregarMail(e);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		destino.agregarMail(email);
		origen.removerMail(email);
	}
	
	public Email buscar(String texto) {
		if (this.inbox.buscar(texto) != null) {
			return this.inbox.buscar(texto);
		}
		return this.carp.stream()
				.map(carpeta -> carpeta.buscar(texto))
				.filter(email -> email != null)
				.findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return (int) this.inbox.espacioOcupado() + (int) this.carp
				.stream()
				.mapToDouble(carpeta -> carpeta.espacioOcupado())
				.sum();
	}
}
