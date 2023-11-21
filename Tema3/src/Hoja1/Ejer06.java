package Hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		// Escribe un programa que pida por consola los precios de diez productos y los
		// guarde en un array.
		// Haz que después se muestren todos los valores mediante un bucle for.

		Scanner entrada = new Scanner(System.in);
		Double[] precios = new Double[10];

		System.out.println("Escribe el precio de 10 productos:");

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Producto " + (i+1) + ": ");
			precios[i] = entrada.nextDouble();

		}

		System.out.print("\nProductos: ");

		for (int i = 0; i < precios.length; i++) {

			System.out.print(precios[i] + " ");
		}

	}

}
