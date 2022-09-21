package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

	private List<Usuario> usuarios;
	private double precioKWh;
	
	public Distribuidora() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario( Usuario user) {
		this.usuarios.add(user);
	}

	public double precioKWh() {
		return this.precioKWh;
	}
	
	public double consumoTotalActiva() {
		
		
		return null;
	}
}
