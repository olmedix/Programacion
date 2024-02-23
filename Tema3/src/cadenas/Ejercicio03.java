package cadenas;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Programa que pide una frase y luego la muestra del revés (letra a letra).

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una frase: ");
		String palabra = entrada.nextLine();

		for (int i = palabra.length()-1; i >= 0; i--) {

			System.out.print(palabra.charAt(i));
		}

	}

}
