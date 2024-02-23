package Hoja2;

import java.util.Arrays;

public class Ejer09b {

	public static void main(String[] args) {
		// Crea un programa que muestre los siguientes precios
		// (guardados en un array llamado precios)
		// ordenados de mayor a menor, usando el método de selección.

		int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int posMax;
		int aux;

		for (int i = 0; i < precios.length - 1; i++) {

			posMax = i;

			for (int j = i + 1; j < precios.length; j++) {

				if (precios[j] > precios[posMax]) {

					posMax = j;

				}

				

			}
			aux = precios[posMax];
			precios[posMax] = precios[i];
			precios[i] = aux;
			System.out.println(Arrays.toString(precios));

		}

	}

}