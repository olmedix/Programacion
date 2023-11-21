package hoja2Bucles;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota;
		double suma=0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Escribe una nota");
			nota = entrada.nextDouble();

			while (!(nota >= 0 && nota <= 10)) {
				System.out.println("Esa nota no vale");
				System.out.println("Escribe una nota");
				nota = entrada.nextDouble();
			}
			
			suma = suma + nota;

		}
		System.out.println("La nota media es: " + suma/5);

	}

}
