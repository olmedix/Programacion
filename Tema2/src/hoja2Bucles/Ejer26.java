package hoja2Bucles;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe un número para conocer su tabla de multiplicar: ");
			num = entrada.nextInt();

			if(num ==1) {
				System.out.println("¡No seas tonto!");
				continue;
			}
			for (int j = 1; j <= 10; j++) {
				System.out.println(num + " * " + j + " = " + num* j);
		
			}
		}
	}

}
