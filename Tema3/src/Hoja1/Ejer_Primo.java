package Hoja1;

import java.util.Scanner;

public class Ejer_Primo {

	public static void main(String[] args) {
		// Programa que te pregunta un número entero y te diga si es primo o compuesto

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número: ");
		int numero = entrada.nextInt();
		boolean esPrimo = true;

		for (int i = 2; i < (numero/2); i++) {

			if (numero % i == 0) {
				esPrimo = false;
				
				break;
			}
		}

		System.out.println(esPrimo);
	}

}
