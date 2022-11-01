package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {

	private String nombre;
	private List<Reserva> reservas = new ArrayList();
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private Usuario propietario;
	
	public Propiedad(String nombre, String descripcion, String direccion, double precio, Usuario propietario) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.descripcion=descripcion;
		this.precioPorNoche=precio;
		this.propietario=propietario;
	}
	
	public double getPrecio() {
		return this.precioPorNoche;
	}
	public Usuario getPropietario() {
		return this.propietario;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean disponibilidad(DateLapse another) {
		return this.reservas.stream().noneMatch(reserva -> reserva.overlaps(another));
	}
	
	public void agregarReserva(Reserva r) {
		reservas.add(r);
	}
	
	public void eliminarReserva(Reserva r) {
		reservas.remove(r);
	}
	public double calcularIngresosPropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(reserva -> reserva.overlaps(periodo)).mapToDouble(reserva -> reserva.calcularReserva()).sum();  													// HACER DESP
	}
	
	public double calcularPrecio(int dias) {
		return this.precioPorNoche * dias;
	}
}
