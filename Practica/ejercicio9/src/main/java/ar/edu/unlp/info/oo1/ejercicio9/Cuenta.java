package ar.edu.unlp.info.oo1.ejercicio9;

public abstract class Cuenta {

	private double saldo;
	
	public Cuenta() {
		
	}
	
	public Cuenta create() {
		return null;}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositarMonto(double monto) {
		if (this.esCaja() ) { monto -= ( monto * 0.02);}
		this.saldo += monto;
	}
	
	public boolean extraerMonto(double monto) {
		if (this.esCaja() ) { monto *=1.02;}
		if (monto < this.getSaldo()) {
			this.saldo -= monto;
			return true;
		}
		return false;
	}
	
	public abstract boolean esCaja();
	public boolean transferirCuenta(double monto, Cuenta cuentaD) {
		if (this.esCaja() ) { monto *= 1.02;}
		if (this.puedeExtraer(monto)){
			this.extraerSinControl(monto);
			cuentaD.depositarMonto(monto);
			return true;
		}
		return false;
	}
	
	protected void extraerSinControl(double monto) {
		this.saldo -= monto;
	}
	
	
	protected abstract boolean puedeExtraer(double monto);
	
	
	
}
