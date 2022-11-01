package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {	
	private String nombre;
	private String dni;
	private String direccion;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String dni, String direccion) {
		this.reservas = new ArrayList<Reserva>();
		this.propiedades = new ArrayList<Propiedad>();
		this.nombre=nombre;
		this.dni=dni;
		this.direccion=direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Propiedad> getPropiedades(){
		return this.propiedades;
	}
	public List<Reserva> getReservas(){
		return this.reservas;
	}
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}
	
	public void eliminarReserva(Reserva r) {
		this.reservas.remove(r);
	}
	
	public void agregarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}
	public void eliminarPropiedad(Propiedad p) {
		this.propiedades.remove(p);
	}
	
	public double calcularIngresoPropietario(DateLapse another) {
		return this.propiedades.stream().mapToDouble(propiedad -> propiedad.calcularIngresosPropiedad(another)).sum();
	}
}
