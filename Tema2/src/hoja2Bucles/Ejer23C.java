package hoja2Bucles;

import java.util.Scanner;

public class Ejer23C {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe 5 notas válidas entre 0 y 10:");
		double nota=0;
		double media=0;

		for (int i = 1; i <= 5; i++) {
			do {
				System.out.print("Nota " + i + ": ");
				nota = entrada.nextDouble();

			} while (nota < 0 || nota > 10);
			System.out.println();
			
			media =media + nota;
		}
		
		System.out.println("la nota media es: " + media/5);
	}
	
}
