package Hoja1;

public class Ejer_14_Primo {

	public static void main(String[] args) {
		final int CAPACIDAD = 100;
		int[] numero = new int[CAPACIDAD];
		int num = 2;
		int numPrimos = 0;

		while (numPrimos < CAPACIDAD) {
			boolean esPrimo = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				numero[numPrimos] = num;
				System.out.println(numPrimos + ") " + numero[numPrimos]);
				numPrimos++;
			}

			num++;
		}

	}
}
