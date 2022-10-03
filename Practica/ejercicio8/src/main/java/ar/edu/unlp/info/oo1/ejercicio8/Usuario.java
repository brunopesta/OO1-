package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
	
	public Optional<Consumo> ultimoConsumo() {
        Stream <Consumo>consumosOrdenados = this.con.stream().sorted((c1, c2)-> c2.getFecha().compareTo(c1.getFecha()));
        Optional<Consumo> ultimoConsumo = consumosOrdenados.findFirst();
        return ultimoConsumo;
    }

    public double ultimoConsumoActiva() {
        Optional<Consumo> ultimoConsumo = ultimoConsumo();
        if (ultimoConsumo != null) {
            return ultimoConsumo.get().getConsumoEnergiaActiva();
        }
        return 0;
    }

    public Factura facturarEnBaseA(double unPrecioKWH) {
        double descuento = 1; 
        Optional<Consumo> ultimoConsumo = ultimoConsumo();
        if (ultimoConsumo.get().factorDePotencia() > 0.8) {descuento = 0.1;}
        Factura unaFactura = new Factura(ultimoConsumoActiva(),descuento ,this);

        return unaFactura;
    }
}

