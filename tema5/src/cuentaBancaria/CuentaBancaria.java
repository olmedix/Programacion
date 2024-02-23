package cuentaBancaria;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(int cantidad) {
		saldo += cantidad;
	}

	public boolean retirar(int cantidad) {
		if (cantidad > saldo) {
			return false;
		}
		saldo -= cantidad;
		return true;
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public void depositar(int cantidad, int comision) {
		cantidad = cantidad - cantidad * comision / 100;
		saldo += cantidad;
	}

	public boolean retirar(int cantidad, int comision) {

		cantidad = cantidad + (cantidad * comision / 100);
		if (cantidad >= saldo) {
			return false;
		}

		saldo -= cantidad;
		return true;
	}

}
