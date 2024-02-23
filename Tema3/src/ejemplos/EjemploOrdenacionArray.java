package ejemplos;

import java.util.Arrays;

public class EjemploOrdenacionArray {

	public static void main(String[] args) {

		int[] valores = { 20, 12, 22, 15, 3 };

		System.out.println(Arrays.toString(valores));

		// Indicará la posición del mínimo del array que falta por ordenar.
		int posMin;
		int aux;

		for (int i = 0; i < valores.length - 1; i++) {
			// La variable i indica a partir de qué posición el array aún está desordenado.

			// En cada pasada del bucle se buscará el mínimo
			// desde i hasta el final
			posMin = i;

			// Recorremos el array desde la posición i hasta el final.
			for (int j = i + 1; j < valores.length; j++) {

				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}

			// Intercambiar las posiciones i y posMin.
			aux = valores[i];
			valores[i] = valores[posMin];
			valores[posMin] = aux;

			System.out.println(Arrays.toString(valores));

		}

	}

}
