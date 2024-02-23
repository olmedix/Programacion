package cadenas;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Programa que lee una frase desde el teclado y la muestra quitando la primera
		// palabra.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();
		int posInicial = frase.indexOf(" ");

		for (int i = posInicial+1; i < frase.length(); i++) {

			System.out.print(frase.charAt(i));

		}

	}

}
