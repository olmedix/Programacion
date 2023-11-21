package hoja2Bucles;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int eleccion = 0;
		final int NUM_SECRETO = 6;

		for (int i = 0; i < 10; i++) {
			System.out.print("Adivina el número secreto:");
			eleccion = entrada.nextInt();

			if (eleccion == NUM_SECRETO) {
				break;
			}

		}
		if (eleccion == NUM_SECRETO) {
			System.out.println("Felicidades");
		} else {
			System.out.println("Has perdido...");
		}

	}

}
