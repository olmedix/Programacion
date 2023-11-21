package repaso;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int aleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(aleatorio);

		do {
			System.out.print("Adivina el número:");
			int num = entrada.nextInt();

			if (num == aleatorio) {
				System.out.println("Acertaste");
				System.exit(0);
			}
			i++;
		} while (i < 3);
		System.out.println("Has perdido");

	}

}
