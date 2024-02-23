package cadenas;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Programa que lee una frase desde el teclado y la muestra quitando la última palabra.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();
		
		String[] palabras = frase.split(" ");
		
		for (int i = 0; i < palabras.length-1; i++) {
			
			System.out.print(palabras[i] + " ");
		}

	}

}
