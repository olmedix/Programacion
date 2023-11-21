package hoja3Bucles;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		while (true) {
			int num = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			int resultado;
			
			System.out.println("Calcula la suma de los siguientes números:");
			System.out.println("Primer número: " + num);
			System.out.println("Segundo número: " + num2);
			resultado = entrada.nextInt();

			if (resultado == num + num2) {
				System.out.println("Has acertado!!!");
			} else {
				System.out.println("Has fallado...");
			}

		}

	}

}
