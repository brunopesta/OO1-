package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private List<Farola> lista;
	private boolean estado;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.estado = false;
		this.lista = new ArrayList<Farola>();
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.lista.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.lista;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!this.estado) {
			this.estado = true;
			this.lista.forEach(faro -> faro.turnOn());
		}
		
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.estado) {
			this.estado = false;
			this.lista.forEach(farolin -> farolin.turnOff());
			
		}
		
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.estado;
	}


}
