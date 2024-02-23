package ejemplos;

import java.util.Scanner;

public class ArrayDesordenado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i;
		double[] tallas = { 37, 40, 40.5, 45, 47, 40, 36.5, 41, 47.5, 39 };
		boolean encontrado = false;

		// leemos una talla desde la terminal
		System.out.println("Indique una talla y le diré si está en el array:");
		double talla = entrada.nextDouble();

		// buscamos si la talla se encuentra. Si está diremos en que posición,
		// si no, lo indicaremos.

		for (i = 0; i < tallas.length; i++) {

			if (tallas[i] == talla) {
				encontrado = true;
				break;
			}

		}
		if (encontrado) {
			System.out.println("Tu talla se encuentra en la posición " + i);
		} else {
			System.out.println("Su talla no se ha encontrado.");
		}

	}

}
