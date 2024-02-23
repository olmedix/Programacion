package Hoja2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		/*
		 * Escribe una aplicación que vaya preguntando los votos de seis partidos
		 * políticos en unas elecciones y guardándolos en un array. Al acabar, dirá cuál
		 * ha sido el menor número de votos y cuál el mayor, así como las posiciones del
		 * array que ocupan estos partidos.
		 */

		Scanner entrada = new Scanner(System.in);

		String[] partidos = { "PP", "PSOE", "VOX", "SUMAR", "PODEMOS", "PACMA" };
		int[] votos = new int[6];
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < votos.length; i++) {

			System.out.print("¿ Cuántos votos a recibido " + partidos[i] + " ?: ");
			votos[i] = entrada.nextInt();
		}

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] < votos[posMin]) {

				posMin = i;

			} else if (votos[i] > votos[posMax]) {

				posMax = i;
			}
		}

		System.out.println("\nEl número más bajo de votos ha sido " + votos[posMin] + " que pertenece al partido de "
				+ partidos[posMin]);
		System.out.println("El número más alto de votos ha sido " + votos[posMax] + " que pertenece al partido de "
				+ partidos[posMax]);
	}

}
