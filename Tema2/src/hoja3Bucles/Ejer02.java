package hoja3Bucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int) (Math.random() * 10 + 1);
		int i = 1;
		int num = 0;

		System.out.println(aleatorio);
		while (i <= 3) {
			System.out.print("Adivina el número secreto: ");
			num = entrada.nextInt();

			if (num == aleatorio) {
				System.out.println("Has acertado en el intento " + i);
				break;
			}

			i++;
		}
		if (!(num == aleatorio)) {
			System.out.println("Lo siento no has acertado.");
		}
		switch (i) {
		case 1:
			System.out.println("10 Puntos.");
			break;
		case 2:
			System.out.println("5 Puntos.");
			break;
		case 3:
			System.out.println("2 Puntos.");
			break;
		default:
			System.out.println("0 Puntos");
		}
	}

}
