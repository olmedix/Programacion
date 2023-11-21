package hoja2Bucles;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		// Escribe un programa que solicite un número al usuario y, a continuación,
		// muestre la tabla de
		// multiplicar de ese número
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número y te mostraré su tabla de multiplicar:");
		int num = entrada.nextInt();
		int contador = 1;

		while (contador <= 10) {
			System.out.println(num + " * " + contador + " = " + contador * num);

			contador++;
		}
	}

}
