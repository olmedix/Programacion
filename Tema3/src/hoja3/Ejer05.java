package hoja3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[] precios = new double[50];
		final int DESCUENTO = 50;
		double sumaPrecios = 0, total = 0;
		int contador = 0;

		System.out.println("Caja registradora");
		System.out.println("=========================");

		for (int i = 0; i < precios.length; i++) {

			System.out.println("Precio " + i + ": ");
			precios[i] = entrada.nextDouble();

			// Verificamos el valor, en caso de que sea negativo salimos y mostramos el
			// total.
			if (precios[i] < 0) {
				break;
			}

			if (sumaPrecios >= DESCUENTO) {

				precios[i] -= (precios[i] * 0.10);
			}
			
			// Sumamos la compra para luego verificar si ha superado los 50€ y hacer el
			// descuento.
			sumaPrecios += precios[i];
			
			// Sumamos el total de la compra con los descuentos incluidos.
			total += precios[i];

			contador++;
		}

		System.out.println("\nTicket de la compra.");

		for (int i = 0; i < contador; i++) {
			System.out.println(precios[i]);
		}

		System.out.println("\nTotal a pagar: " + total + " €.");
		System.out.println("Gracias por la compra.");

	}

}
