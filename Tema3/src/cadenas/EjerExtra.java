package cadenas;

import java.util.Scanner;

public class EjerExtra {
	public static void main(String[] args) {
		/*
		 * Programa que busca una palabra dentro de una frase mostrándonos todas las
		 * posiciones donde aparece.
		 */

		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = escaner.nextLine();

		System.out.println("Introduce una palabra: ");
		String palabra = escaner.nextLine();
		
		int posicion = frase.indexOf(palabra);
		
		if(posicion == -1) {
			System.out.println("No se ha encontrado la palabra.");
			System.exit(0);
		}

		while (posicion != -1) {
			System.out.println("La palabra " + palabra 
					+ " aparece en la posición " + posicion);
			posicion = frase.indexOf(palabra, posicion + palabra.length());
		}
		
		escaner.close();
	}
}