package Hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] test = new String[5];
		char letra = 'a';

		System.out.println("Escribe una pregunta: ");
		test[0] = entrada.nextLine();

		for (int i = 1; i < test.length; i++) {
			System.out.print("Escribe la " + i + " posibilidad: ");
			test[i] = entrada.nextLine();

		}

		System.out.println("\n" + test[0]);

		for (int i = 1; i < test.length; i++) {
			System.out.println((letra++) + ") " + test[i]);

		}

	}

}
