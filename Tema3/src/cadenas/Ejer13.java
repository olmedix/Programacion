package cadenas;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] mascotas = new String[5];
		
		// Leemos los nombres de las mascotas.
		
		System.out.println("Escribe cinco mascotas:");
		for (int i = 0; i < mascotas.length; i++) {
			System.out.println("Mascota " + (i+1) + ": ");
			mascotas[i] = entrada.nextLine();
		}
		
		// Buscamos el mínimo del array.

		int posMin = 0;
		for (int i = 1; i < mascotas.length; i++) {

			if (mascotas[i].compareTo(mascotas[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println("La primera palabra, alfabéticamente, es " 
				+ mascotas[posMin] + ".");

	}

}
