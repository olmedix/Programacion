package Hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		// Escribe una aplicación que pida al usuario diez precios de productos. Después
		// devolverá el
		// precio total a pagar y el número de productos cuyo precio sea mayor de 10
		// euros

		Scanner entrada = new Scanner(System.in);
		double[] precios = new double[10];
		double precioTotal = 0;
		int contador = 0;

		for (int i = 0; i < precios.length; i++) {

			System.err.print("Escribe el precio del producto: ");
			precios[i] = entrada.nextDouble();

			precioTotal += precios[i];

			if (precios[i] > 10) {

				contador++;
			}
		}

		System.out.println("\nEl precio total a pagar es : " + precioTotal);
		System.out.println("Existen " + contador + " productos por encima de 10€.");
	}

}
