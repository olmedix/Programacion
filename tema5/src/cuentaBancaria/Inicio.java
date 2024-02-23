package cuentaBancaria;

public class Inicio {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria(1000);

		System.out.println(cuenta.obtenerSaldo());

		cuenta.depositar(200);
		System.out.println(cuenta.obtenerSaldo());

		boolean resultado = cuenta.retirar(100);
		if (!resultado) {
			System.out.println("No se ha podido hacer la retirada.");
		}
		System.out.println(cuenta.obtenerSaldo());

		resultado = cuenta.retirar(10_000);
		if (!resultado) {
			System.out.println("No se ha podido hacer la retirada.");
		}
		System.out.println(cuenta.obtenerSaldo());

		cuenta.depositar(100, 10);
		System.out.println(cuenta.obtenerSaldo());

		cuenta.retirar(100, 5);
		System.out.println(cuenta.obtenerSaldo());

	}

}
