package Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Escribe un programa que pregunte las temperaturas de las últimas ocho horas y
		// las muestre
		// ordenadas de menor a mayor, usando el método de selección. Al final también
		// indicará la
		// temperatura menor y la mayor.

		Scanner entrada = new Scanner(System.in);

		double[] temperaturas = new double[8];
		int posMin;
		double aux;
		int minima = 0;
		int maxima = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Escribe la " + (i + 1) + " temperatura: ");
			temperaturas[i] = entrada.nextDouble();
		}

		for (int i = 0; i < temperaturas.length-1; i++) {

			posMin = i;

			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {

					posMin = j;

				}
				
			}
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;

		}

		System.out.println(Arrays.toString(temperaturas));
		System.out.println("\nMáxima: " + temperaturas[temperaturas.length-1] + " y mínima: " + temperaturas[0]);
	}

}
