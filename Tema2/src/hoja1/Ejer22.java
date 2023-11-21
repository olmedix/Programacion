package hoja1;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número del 1 al 10");

		if (entrada.hasNextInt()) {
			int num = entrada.nextInt();
			if (num > 0 && num < 11) {
				System.out.println(" El número es correcto has escrito el " + num);
			} else {
				System.out.println("No has escrito un número.");
			}
		}
	}

}
