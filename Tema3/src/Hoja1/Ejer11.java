package Hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] ordenes = new String[1000];

		System.out.println("Escribe las ordenes que debe ejecutar el robot.");
		System.out.println("Para finalizar escribe \"ejecutar\" y te mostraré todas las ordenes dadas. ");

		for (int i = 0; i < ordenes.length; i++) {

			ordenes[i] = entrada.nextLine();

			if (ordenes[i].toLowerCase().equals("ejecutar")) {

				break;
			}

		}
		System.out.println("\nInstrucciones: ");

		for (int i = 0; i < ordenes.length; i++) {

			if (ordenes[i].toLowerCase().equals("ejecutar")) {

				break;
			}
			System.out.println(ordenes[i]);
		}

	}

}
