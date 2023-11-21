package hoja2Bucles;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		// Crea un programa que escriba los 50 primeros números pares

		int contador = 1;
		int numPares=0;

		while (contador <= 50) {
			
			System.out.println(numPares);

			numPares = numPares + 2;
			contador ++;
		}

	}

}
