package Hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		// Crea una aplicación que vaya leyendo y guardando en un array las estaturas de
		// 10 personas. A
		// continuación, recorrerá el array y nos informará de si alguna de estas
		// estaturas es mayor de 1'90 m

		Scanner entrada = new Scanner(System.in);

		double[] estaturas = new double[10];

		for (int i = 0; i < estaturas.length; i++) {
			System.out.print("Escribe la  " + (i + 1) + " estatura: ");
			estaturas[i] = entrada.nextDouble();

		}
		System.out.println("\n====Posiciones=====\n");

		for (int i = 0; i < estaturas.length; i++) {

			if (estaturas[i] > 1.9) {
				System.out.println("La posición " + i + " es mayor a 1'90 m.");
			}

		}

	}

}
