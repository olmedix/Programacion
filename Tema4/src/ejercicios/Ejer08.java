package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe el coefiente a: ");
		int a = entrada.nextInt();

		System.out.print("Escribe el coefiente b: ");
		int b = entrada.nextInt();

		System.out.print("Escribe el coefiente c: ");
		int c = entrada.nextInt();

		System.out.println("El resultado (positivo)  es " + solucionPositiva(a, b, c));
		System.out.println("El resultado (negativo)  es " + solucionNegativa(a, b, c));

	}

	static double solucionPositiva(int a, int b, int c) {

		return (-b + Math.sqrt(Math.pow(b, 2)) / (2 * a));
	}

	static double solucionNegativa(int a, int b, int c) {

		return (-b - Math.sqrt(Math.pow(b, 2)) / (2 * a));
	}

}
