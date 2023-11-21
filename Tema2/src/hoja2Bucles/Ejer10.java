package hoja2Bucles;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se escribe 30 en hexadecimal?");
		System.out.println("1) 1E");
		System.out.println("2) 2F");
		System.out.println("3) 33");
		System.out.println("4) Ninguno de los anteriores.");
		int opcion = entrada.nextInt();
		while (opcion > 4 || opcion < 1) {
			System.out.println("¿Cómo se escribe 30 en hexadecimal?");
			System.out.println("1) 1E");
			System.out.println("2) 2F");
			System.out.println("3) 33");
			System.out.println("4) Ninguno de los anteriores.");
			opcion = entrada.nextInt();
		}
		if (opcion == 1) {
			System.out.println("Has acertado !!!");
		} else {
			System.out.println("Lo siento, te has equivocado.");
		}

	}

}
