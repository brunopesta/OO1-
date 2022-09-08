package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {

	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> lista; 
	
	public Balanza() {
		this.lista = new ArrayList<>();
	}
	public void ponerEnCero() {
	//	this.cantidadDeProductos = 0;
	//	this.precioTotal = 0;
	//	this.pesoTotal = 0;
		this.lista.clear();
	}
	
	public void agregarProducto(Producto p) {
	//	this.cantidadDeProductos++;
	//	this.precioTotal += p.getPrecio();
//		this.precioTotal+= (p.getPrecioPorKilo()*p.getPeso()); hacer lo de  arriba: DELEGACION
	//	this.pesoTotal += p.getPeso(); //
		this.lista.add(p);
	}
	
	public List<Producto> getProductos(){
		return this.lista;
		
	}
	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());		
	}
	
	public int getCantidadDeProductos() {
		return this.lista.size();
	}
	
	public double getPrecioTotal() {
		double count = 0;
		for (Producto p: this.lista) {
			count += p.getPrecio();
		}
		return count;
	}
	
	public double getPesoTotal() {
		double count = 0;
		for (Producto p: this.lista) {
			count += p.getPeso();
		}
		return count;
	}
}

