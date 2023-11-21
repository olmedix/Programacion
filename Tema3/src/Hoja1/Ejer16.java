package Hoja1;

public class Ejer16 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		double total = 0;
		int contador = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			total += temperaturas[i];

			if (temperaturas[i] > 12) {
				contador++;
			}
		}

		System.out.println("La temperatura media es " + total / temperaturas.length + " ºC");
		System.out.println("Hay " + contador + " por encima de 12ºC");
	}

}
