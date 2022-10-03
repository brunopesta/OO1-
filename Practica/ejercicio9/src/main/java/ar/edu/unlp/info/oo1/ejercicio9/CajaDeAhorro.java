package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	private double interes;
	
	
	public CajaDeAhorro() {
		
	}


	@Override
	public boolean puedeExtraer(double monto) {
		interes = (monto * 0.02);
		if (this.getSaldo() >= (monto + interes)) {
			return true;
			
		}
		return false;
	}


	@Override
	public boolean esCaja() {
		return true;
	}
}
