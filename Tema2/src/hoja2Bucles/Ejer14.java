package hoja2Bucles;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?");
			System.out.println("1) Douglas Capland");
			System.out.println("2) Isaac Asimov");
			System.out.println("3) Ernest Cline");
			System.out.println("4) Ray Bradbury");
			opcion = entrada.nextInt();

		} while (opcion < 1 || opcion > 4);

		if (opcion == 3) {
			System.out.println("Has acertado!!!");
		} else {
			System.out.println("Lo siento,te has equivocado");
		}
	}

}
