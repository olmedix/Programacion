package hoja1;

import java.util.Scanner;

public class EJer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una nota:");
		double nota = entrada.nextDouble();

		if (nota >= 0 && nota < 4) {
			System.out.println("Rojo");
		} else if (nota >= 4 && nota < 5) {
			System.out.println("Verde");
		} else if (nota >= 5) {
			System.out.println("Azul");
		}
	}

}
