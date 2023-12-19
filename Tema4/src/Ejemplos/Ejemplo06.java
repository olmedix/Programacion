package Ejemplos;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un número para ver su tabla de multiplicación: ");
		int num = entrada.nextInt();

		System.out.println("Tabla de multiplicar");
		System.out.println("======================\n");
		tablaMultiplicar(num);

	}

	// Muestra la tabla de multiplicar del número que le pases.
	static void tablaMultiplicar(int num) {
		
		for (int i = 1; i <= 10; i++) {

			System.out.println(i + "x" + num +": " + num * i);
		}

	}

}
