package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String domicilio;	
	private List<Consumo> con;
	private List<Factura> fac;

	public Usuario(String nombre, String unDom){
		this.nombre = nombre;
		this.domicilio = unDom;
		this.con = new ArrayList<Consumo>();
		this.fac = new ArrayList<Factura>();
	}
	
	public void agregarMedicion(Consumo medicion  ) {
		this.con.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		this.con.stream().max((unaFecha, otraFecha) -> unaFecha.getFecha());
		return 2;
	}

	
	public List<Factura> facturas(){
		return this.fac;
	}


}

