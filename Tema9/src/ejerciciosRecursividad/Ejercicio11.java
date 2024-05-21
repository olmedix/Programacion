package ejerciciosRecursividad;

public class Ejercicio11 {
	static int posMax = 0;

	public static void main(String[] args) {
		// Crea un método que permita obtener el mayor elemento de un array de números
		// decimales
		// (double).

		double[] numeros = { 3.3, 3.5, 4.2, 2.3 };
		int n = numeros.length - 1;

		System.out.println("El número más grande es: " + maxNum(numeros, n));

	}

	private static double maxNum(double[] numeros, int n) {

		if (n <= 0) {
			return numeros[posMax];
		}

		if (maxNum(numeros, n - 1) < numeros[n]) {
			posMax = n;
		}

		return numeros[posMax];

	}

}
