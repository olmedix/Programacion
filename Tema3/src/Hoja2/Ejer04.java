package Hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double[] productos = new double[10];
		double precioTotal = 0;
		int j = 0;
		boolean preciosCorrectos = true;

		for (int i = 0; i < productos.length; i++) {
			System.out.print("Escribe el precio de un producto: ");
			productos[i] = entrada.nextDouble();

			precioTotal += productos[i];
		}

		for (j = 0; j < productos.length; j++) {

			if (productos[j] < 0) {

				preciosCorrectos = false;
				break;
			}
		}

		if (preciosCorrectos) {
			System.out.println("La suma de todos los precios es " + precioTotal + " €.");
		} else {
			System.out.println("Se ha encontrado un valor no válido en la posición " + j);
		}

	}

}
