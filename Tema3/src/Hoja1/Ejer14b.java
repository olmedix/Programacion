package Hoja1;

public class Ejer14b {

	public static void main(String[] args) {
		// Modifica el ejercicio 14 para que al comprobar si un número es primo
		// se divida sólo entre los primos que ya se han encontrado
		// (y que ya están en el array).

		// EJEMPLO: para comprobar si 11 es primo, basta con dividirlo
		// entre 2,3,5,7.

		final int CAPACIDAD = 10;
		int[] numeros = new int[CAPACIDAD];
		int num = 2;
		int numPrimos = 0;
		int cont = 0;

		while (numPrimos < CAPACIDAD) {
			boolean esPrimo = true;

			for (int i = 0; i <= numPrimos - 1; i++) {

				if (num % numeros[i] == 0) {
					esPrimo = false;

					break;
				}
			}

			if (esPrimo) {
				numeros[numPrimos] = num;
				System.out.println(numPrimos + ") " + numeros[numPrimos]);
				numPrimos++;

			}

			num++;
		}
	}

}
