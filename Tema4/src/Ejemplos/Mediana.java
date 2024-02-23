package Ejemplos;

import java.util.Arrays;

// Programa de consola que va a recibir 5 datos y nos va a mostrar la mediana
// de esos datos.
public class Mediana {

	public static void main(String[] args) {

		// Comprobamos los datos recibidos desde la terminal.
		System.out.println(Arrays.toString(args));

		// Creamos una array de enteros con los mismos valores leídos dela terminal.
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(args[i]);
		}

		System.out.println(Arrays.toString(numeros));

		// Calculamos la mediana llamando al método mediana().
		System.out.println("Mediana: " + mediana(numeros));
	}

	// Devuelve la mediana de un array de números enteros que ha recibido como argumento.
	static double mediana(int[] numeros) {

		ordenar(numeros);

		if (numeros.length % 2 == 0) {
			return numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1] / 2;
		}
		return numeros[(numeros.length / 2)];

	}

	// Ordena un array de números enteros.
	static void ordenar(int[] numeros) {

		int posMin, aux;

		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}

	}

}
