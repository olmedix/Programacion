package Hoja2;

import java.util.Iterator;

public class Ejer05 {

	public static void main(String[] args) {
		// Escribe un programa que guarde las siguientes temperaturas en un array y
		// busque su máximo y
		// mínimo. Además deberá indicar en qué posición del array están ese máximo y
		// mínimo.

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < temperaturas.length; i++) {

			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			} else if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}

		System.out.println("Temperatura mínima: " + temperaturas[posMin] + " posición: " + posMin);
		System.out.println("Temperatura máxima: " + temperaturas[posMax] + " posición: " + posMax);
	}

}
