package cadenas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Programa que lee una frase y nos dice por cuántas palabras está formada. Usa
		// el
		// método indexOf(int caracter, int posicion).

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		int numPalabras = 1;
		int posEspacio = frase.indexOf(" ");

		while (posEspacio != -1) {

			numPalabras++;
			posEspacio = frase.indexOf(" ", posEspacio + 1);

		}
		System.out.println("La frase tiene " + numPalabras + " palabras.");

	}

}
