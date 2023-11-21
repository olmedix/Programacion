package hoja1;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero");
		int num = entrada.nextInt();

		String comparacion = num % 2 == 0 ? "No es impar" : "Es impar";

		System.out.println(comparacion);

	}

}
