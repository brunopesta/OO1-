package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

	private List<Usuario> usuarios;
	private double precioKWh;
	private List<Consumo> consumo;
	
	public Distribuidora( double precio) {
		this.usuarios = new ArrayList<Usuario>();
		this.precioKWh = precio;
	}
	
	public void agregarUsuario( Usuario user) {
		this.usuarios.add(user);
	}

	public double precioKWh() {
		return this.precioKWh;
	}
	public double consumoTotalActiva() {
        double total = 0;
        for (int i = 0; i < usuarios.size();i++) { 
            total += usuarios.get(i).ultimoConsumoActiva();
        }
        return total;
    }
}
