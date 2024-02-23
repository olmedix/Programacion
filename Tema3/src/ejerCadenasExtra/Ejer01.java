package ejerCadenasExtra;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Palabras capicúa (palíndromos) ***\n");

		System.out.println("Escribe una palabra y te diré si es capicúa:");
		String palabra = entrada.nextLine();

		if (esCapicua(palabra)) {
			System.out.println("¡Es capicúa!");
		} else {
			System.out.println("¡No lo es!");
		}

	}

	static boolean esCapicua(String palabra) {
		int j = 0;
		for (int i = palabra.length() - 1; i >= 0; i--) {

			char letra = palabra.charAt(i);

			if (letra == palabra.charAt(j)) {
				j++;

			} else {
				return false;
			}

		}
		return true;
	}

}
