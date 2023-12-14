package cadenas;

import java.util.Arrays;

public class Ejer14 {

	public static void main(String[] args) {

		String[] mascotas = { "gato", "perro", "hamster", "tortuga", "agaporni" };

		// Ordenamos el array.
		int posMin;
		String aux;

		for (int i = 0; i < mascotas.length - 1; i++) {

			// Buscamos el mínimo en la parte del array que aún no
			// está ordenada.

			posMin = i;
			for (int j = i + 1; j < mascotas.length; j++) {
				if (mascotas[j].compareTo(mascotas[posMin]) < 0) {
					posMin = j;
				}
			}

			// Intercambiamos la primera posición del array sin ordenar
			// por la posición con el mínimo.
			aux = mascotas[i];
			mascotas[i] = mascotas[posMin];
			mascotas[posMin] = aux;

			System.out.println(Arrays.toString(mascotas));

		}

	}

}
