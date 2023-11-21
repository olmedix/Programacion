package Hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		// Modifica el programa anterior para que el programa pare de pedir notas si se
		// le pasa un valor
		// negativo.

		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[10];
		int i = 0;

		System.out.println("Escribe 10 notas:\n ");

		while (i < 10) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

			if (notas[i] < 0) {
				break;
			}

			i++;
		}

		System.out.print("\nNotas: ");
		for (i = 0; i < notas.length; i++) {

			if (notas[i] < 0) {
				break;
			}

			System.out.print(notas[i] + "\t");
		}

	}

}
