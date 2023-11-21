package Hoja1;

public class Ejer14 {

	public static void main(String[] args) {
		// Escribe un programa que rellene un array llamado primos con los 100
		// primeros números

		int[] primos = new int[100];
		int num = 0;

		while (true) {

			while (num % num == 0 && num % 1 == 0) {

				for (int i = 0; i < primos.length; i++) {
					primos[i] = num;
				}

			}

			num++;
		}

	}

}
