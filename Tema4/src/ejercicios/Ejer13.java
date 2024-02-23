package ejercicios;

import java.util.Arrays;

public class Ejer13 {

	public static void main(String[] args) {

		int[] numeros = { 4, 7, 2, 98, 76, 43, 12 };

		System.out.println(Arrays.toString(ordenaNumeros(numeros)));

	}

	static int[] ordenaNumeros(int[] numeros) {

		int posMin, aux;

		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

		return numeros;
	}

}
