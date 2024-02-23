package cadenas;

import java.util.Scanner;

public class Ejercicio18B {

	public static void main(String[] args) {

		// Programa que lee una frase desde el teclado y la muestra quitando la última
		// palabra y poniendo la primera letra en mayúscula.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");
		
		System.out.println(frase.toUpperCase().substring(0,1) + frase.substring(1));

		for (int i = 0; i < palabras.length - 1; i++) {

			System.out.print(palabras[i].toUpperCase().substring(0, 1));

			System.out.print(palabras[i].substring(1) + " ");
		}

	}

}
