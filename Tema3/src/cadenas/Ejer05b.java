package cadenas;

import java.util.Scanner;

public class Ejer05b {
	public static void main(String[] args) {

		/*
		 * Programa que lee una frase y nos dice por cuántas palabras 
		 * está formada. Y que no cuente mas de un espacio junto.
		 */
		Scanner escaner = new Scanner(System.in);

		String frase;
		int numPalabras = 1;

		System.out.println("Introduce una frase: ");
		frase = escaner.nextLine();

		frase = frase.trim();
		
		if(frase.equals("")) {
			System.out.println("La frase está vacía.");
			System.exit(0);
		}

		for (int i = 0; i < frase.length(); i++) {

			if ((frase.charAt(i) == ' ') 
					&& (frase.charAt(i + 1) != ' ')) {
				numPalabras++;
			}
		}

		System.out.println("La frase consta de: " + numPalabras + " palabras.");
		escaner.close();
	}
}