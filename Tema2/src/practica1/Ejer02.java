package practica1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que lea una palabra del usuario y la escriba cinco veces en
		 * la pantalla. A continuación volverá a pedir una palabra al usuario y
		 * mostrarla cinco veces. Y así mientras el usuario no escriba la palabra
		 * "STOP".
		 */
		Scanner entrada = new Scanner(System.in);
		String palabra = "";
		final String PARAR = "STOP";

		System.out.print("Escribe una palabra y la repetiré 5 veces:");
		palabra = entrada.nextLine();

		while (!palabra.toUpperCase().equals(PARAR)) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(palabra);
			}

			System.out.println("Escribe STOP cuando desees parar.");
			palabra = entrada.nextLine();

		};
		

	}

}
