package repaso;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		int suma = 0;

		for (int i = 1; i <= 5; i++) {

			do {
				System.out.print("Nota " + i + ": ");
				nota = entrada.nextInt();

			} while (nota < 0 || nota > 10);
			suma += nota;
		}
		System.out.println("La nota media es " + suma / 5);
	}

}
