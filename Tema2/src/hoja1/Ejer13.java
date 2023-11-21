package hoja1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una nota entre 0 y 10");
		double nota = entrada.nextDouble();

		if (nota >= 0 && nota < 5) {
			System.out.println("Insuficiente.");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente.");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bién.");
		} else if (nota > 6 && nota < 9) {
			System.out.println("Notable.");
		} else if (nota > 8 && nota <= 10) {
			System.out.println("Sobresacliente");
		} else {
			System.out.println("La nota escrita no es correcta.");
		}
		System.out.println("Fin del programa.");
	}

}