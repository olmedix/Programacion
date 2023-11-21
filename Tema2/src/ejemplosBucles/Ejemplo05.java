package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		// Este programa pedirá una serie de precios al usuario
		// Cuando el usuario escriba un 0 , el programa parará.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ve introduciendo  los precios de la cuenta.");
	//Le damos un  valor inicial  a "precio" que haga que la
	//condición del bucle sea verdadera.
		float precio = 1;

	//Mientras precio sea un número positivo, las instrucciones dentro
	//del while se van a ejecutar.
		while (precio > 0) {

			System.out.print("Precio: ");
			precio = entrada.nextFloat();
		}

	}

}
