package cadenas;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Programa que lee una frase y nos dice por cuántas palabras está formada.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();
		int longitud = frase.length();
		int contador = 1;

		for (int i = 0; i < longitud; i++) {

			if (frase.charAt(i) == ' ') {

				contador++;
			}

		}
		System.out.println("La frase tiene " + contador + " palabras.");

	}

}
