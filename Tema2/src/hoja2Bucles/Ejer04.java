package hoja2Bucles;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
//	Escribe una aplicación que pregunte al usuario un número entre 1 y 5. Si responde "3", se le
//	felicitará por haber acertado. Si no, se le seguirá pidiendo más números.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un número entre 1 y 5:");
		int num = entrada.nextInt();

		while (!(num == 3)) {
			System.out.print("Vuelve a escribir un número entre 1 y 5:");
			num = entrada.nextInt();
		}
		System.out.println("Enhorabuena!!");
	}

}
