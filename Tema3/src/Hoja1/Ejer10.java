package Hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[] compra = new double[10];

		for (int i = 0; i < compra.length; i++) {

			System.out.print("Introduce el precio " + (i + 1) + ": ");
			compra[i] = entrada.nextDouble();

			if (compra[i] <= 0) {
				break;
			}

		}

		System.out.println("\nPrecios: ");

		for (int i = 0; i < compra.length; i++) {

			if (compra[i] == 0) {
				break;
			}
			System.out.println(compra[i]);
		}

	}

}
