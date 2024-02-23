package cadenas;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Programa que pide una frase y luego muestra la primera palabra.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != ' ') {
				System.out.print(frase.charAt(i));
			}else if (frase.charAt(i) == ' '){
				break;
			}
		}

	}

}
