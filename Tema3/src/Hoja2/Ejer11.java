package Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// Crea una aplicación que ordene de menor a mayor la lista de edades de los
		// diez alumnos de un
		// curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola

		Scanner entrada = new Scanner(System.in);

		int[] edades = new int[10];
		int posMin;
		int aux;

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Edad: ");
			edades[i] = entrada.nextInt();
		}

		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
		}
		System.out.println(Arrays.toString(edades));
	}

}
