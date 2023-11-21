package hoja2Bucles;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		// Diseña un programa que invente un número aleatorio.
		// A continuación pedirá al usuario que lo adivine.
		// Si el usuario falla, entonces el programa le dará otra oportunidad.
		// Una vez que el usuario adivina el número o falla tres veces, el programa
		// termina.
		Scanner entrada = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(aleatorio);
		int contador = 1;
		int num = 0;

		do {
			System.out.println("Adivina el número:");
			num = entrada.nextInt();

			contador++;
		} while (num != aleatorio && contador <= 3);

		if (num == aleatorio) {
			System.out.println("Enhorabuena!!!");
		} else {
			System.out.println("Lo siento no has acertado");
		}
	}

}
