package hoja2Bucles;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int nota;

		for (int i = 0; i < 5; i++) {

			System.out.println("Escribe una nota");
			nota = entrada.nextInt();

			while (!(nota >= 0 && nota <= 10)) {
				System.out.println("Esa nota no vale");
				System.out.println("Escribe una nota");
				nota = entrada.nextInt();
			}

		}

	}

}
