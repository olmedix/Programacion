package hoja2Bucles;

import java.util.Scanner;

public class Ejer23B {

	public static void main(String[] args) {
		int nota;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Introduce una nota: ");
			nota = entrada.nextInt();

			if (nota < 0 || nota > 10) {
				System.out.println("Error, la nota debe estar entre 0 y 10.");
			} else {
				contador++;
			}
		} while (contador < 5);

		System.out.println("Todas las notas han sido introducidas correctamente.");

	}

}
