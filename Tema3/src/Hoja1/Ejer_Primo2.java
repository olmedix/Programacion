package Hoja1;

public class Ejer_Primo2 {

	public static void main(String[] args) {
		// Haz un programa que muestre en pantalla los números primos
		// que haya desde 2 hasta 1000

		for (int num = 2; num < 1000; num++) {

			boolean esPrimo = true;

			for (int j = 2; j < num / 2; j++) {

				if (num % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(num);
			}

		}

	}

}
