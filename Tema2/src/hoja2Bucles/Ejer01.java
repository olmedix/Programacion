package hoja2Bucles;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
// Crea un programa que pida un carácter al usuario. A continuación lo escribirá 100 veces
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un carácter:");
		String letra = entrada.next();
		int contador = 1;

		while (contador <= 100) {
			System.out.println(contador + ": " + letra);

			contador++;
		}
	}

}
