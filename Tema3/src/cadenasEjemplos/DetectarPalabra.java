package cadenasEjemplos;

import java.util.Scanner;

public class DetectarPalabra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variante en la que descartamos los espacios al principio de frase.

		System.out.println("Dime una frase: ");
		String frase = entrada.nextLine();

		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			// Detectamos el inicio de palabra.
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				System.out.println(frase.charAt(i));

			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				break;
			}

		}

	}

}
