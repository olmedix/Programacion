package examen;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] movimientos = new double[6];
		int posMax;
		double aux, total = 0;
		double positivoTotal = 0, negativoTotal = 0;

		System.out.println("Introduzca los movimientos del día");
		System.out.println("Un valor positivo es un ingreso, y un valor negativo es un gasto.\n");

		for (int i = 0; i < movimientos.length; i++) {
			System.out.println("Movimiento:");
			movimientos[i] = entrada.nextDouble();
		}

		// Quito el -1 en el primero bucle para poder mostrar en el mismo bucle ya
		// ordenado.
		System.out.println("\nLos movimientos, ordenados de mayor a menor, quedan:");
		for (int i = 0; i < movimientos.length; i++) {
			posMax = i;

			for (int j = i + 1; j < movimientos.length; j++) {

				if (movimientos[j] > movimientos[posMax]) {
					posMax = j;
				}
			}
			aux = movimientos[i];
			movimientos[i] = movimientos[posMax];
			movimientos[posMax] = aux;

			System.out.print(movimientos[i] + " ");

			// Suma de todos los valores
			total += movimientos[i];

			// Sumamos los movimientos positivos y negativos por separado.
			if (movimientos[i] < 0) {
				negativoTotal += movimientos[i];
			} else {
				positivoTotal += movimientos[i];
			}
		}

		System.out.println("\n\nEl total de todos los movimientos es: " + total + " euros.");

		System.out.println("\nEn este periodo de tiempo, hemos ingresado " + positivoTotal + " €, y gastado "
				+ negativoTotal + " €.");

	}

}
