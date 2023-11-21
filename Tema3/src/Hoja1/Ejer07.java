package Hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		// Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las
		// diez notas desde la
		// consola, mediante un bucle while, y guardándolas en el array. A continuación,
		// muestra las diez notas

		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[10];
		int i = 0;

		System.out.println("Escribe 10 notas:\n ");

		while (i < 10) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

			i++;
		}

		System.out.print("\nNotas: ");
		for (i = 0; i < notas.length; i++) {

			System.out.print(notas[i] + "\t");
		}

	}

}
