package Hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[10];
		boolean nombreEncontrado = false;

		System.out.println("Escribe nombres de persona y cuando desees parar escribe \"nadie\". \n");

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Escribe el nombre " + (i + 1) + ": ");
			nombres[i] = entrada.nextLine();

			if (nombres[i].equals("nadie")) {
				break;
			}

		}

		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].equals("calderon")) {
				nombreEncontrado = true;
				break;
			}

		}

		if (nombreEncontrado) {
			System.out.println(" de la Barca.");
		} else {
			System.out.println("Nombre no encontrado.");
		}

	}

}
