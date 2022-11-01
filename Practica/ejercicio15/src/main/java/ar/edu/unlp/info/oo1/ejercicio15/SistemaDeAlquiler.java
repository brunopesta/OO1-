package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeAlquiler {

	private List<Propiedad> propiedades;
	private List<Usuario> usuarios;
	
	public SistemaDeAlquiler() {
		this.propiedades = new ArrayList<Propiedad>();
		this.usuarios = new  ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void agregarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}
	
	public List<Propiedad> listarPropiedadesDisponibles(DateLapse periodo){
		return this.propiedades.stream().filter(propiedad -> propiedad.disponibilidad(periodo)).collect(Collectors.toList());
	}
	
	public Reserva realizarReserva(Propiedad p, DateLapse periodo, Usuario u) {
			if (p.disponibilidad(periodo)) {
				Reserva r = new Reserva (periodo,p);
				u.agregarReserva(r);
				p.agregarReserva(r);
				return r;
			}
			return null;
	}
	
	public void eliminarReserva(Reserva res) {
		if (res.inicioPosteriorFechaActual()) {
			this.usuarios.stream().forEach(usuario -> usuario.eliminarReserva(res));
			this.propiedades.stream().forEach(propiedad -> propiedad.eliminarReserva(res));
		}
	}
	
	
	public List<Reserva> obtenerReservasUsuario(Usuario user) {
		return user.getReservas();
	}
	
	public double calcularIngresoPropietario(Usuario user, DateLapse periodo) {
		return user.calcularIngresoPropietario(periodo);
	}
}
