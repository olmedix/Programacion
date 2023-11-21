package hoja1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el número del mes que desea.");
		int numMes = entrada.nextInt();

		if (numMes > 0 && numMes < 5) {
			if (numMes == 1) {
				System.out.println("enero");
			} else if (numMes == 2) {
				System.out.println("Febrero");
			} else if (numMes == 3) {
				System.out.println("Marzo");
			} else if (numMes == 4) {
				System.out.println("Abril");

			}
		} else {
			System.out.println("Número incorrecto!");
		}

	}

}