package cadenas;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();
		

		for (int i = 0; i < frase.length(); i++) {

			System.out.print(frase.charAt(i));

			if (frase.charAt(i) == ' ') {
				break;
			}

		}

	}

}
