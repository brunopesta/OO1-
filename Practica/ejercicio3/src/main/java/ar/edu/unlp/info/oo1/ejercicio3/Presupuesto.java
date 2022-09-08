package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<>();
	}

	public Presupuesto cliente(String unCliente) {
		this.cliente = unCliente;
		return this;
	}
	
	public double calcularTotal() {
		double real =0;
		for (int i=0; i < this.items.size(); i++) {
			real += this.items.get(i).costo();
			}
		return real;
	}
	
	public void agregarItem(Item i) {
		this.items.add(i);
	}
}
