package hoja3;

import java.util.Iterator;

public class Ejer06 {

	public static void main(String[] args) {

		String[][] tabla = new String[3][2];

		tabla[0][0] = "pan";
		tabla[0][1] = "1.75";
		tabla[1][0] = "leche";
		tabla[1][1] = "0.95";
		tabla[2][0] = "agua";
		tabla[2][1] = "0.25";

		// Enseñamos la tabla de productos
		System.out.println("Producto\tPrecio");
		System.out.println("============================");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t\t");
			}
			System.out.println();
		}

		int posMin;
		String[] aux;

		for (int i = 0; i < tabla.length-1; i++) {
			posMin = i;

			for (int j = i + 1; j < tabla.length; j++) {

				if (Double.parseDouble(tabla[j][1]) < Double.parseDouble(tabla[posMin][1])) {
					posMin = j;
					System.out.println(tabla[posMin][1]);
				}

			}

			aux = tabla[i];
			tabla[i] = tabla[posMin];
			tabla[posMin] = aux;
		}

		System.out.println("\n\nProducto\tPrecio");
		System.out.println("============================");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t\t");
			}
			System.out.println();
		}

	}

}
