package hoja3Bucles;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un número que sea entero: ");
		int num = entrada.nextInt();

		for (int i = 1; i < num; i++) {
			System.out.println(i);
		}

	}

}
