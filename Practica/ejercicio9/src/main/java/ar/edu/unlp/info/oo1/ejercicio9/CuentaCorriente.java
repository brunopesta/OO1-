package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {
	
	private double limite;

	public CuentaCorriente() {
		this.limite = 0;
	}

	@Override
	public boolean puedeExtraer(double monto) {
		if (monto <= this.getSaldo() + this.limite) {
			return true;}
		return false;
	}
	
	public double getDescubierto() {
		return this.limite;
	}
	
	public void setDescubierto(double descubierto) {
		this.limite = descubierto;
	}

	public boolean esCaja() {
		return false;
	}
}


