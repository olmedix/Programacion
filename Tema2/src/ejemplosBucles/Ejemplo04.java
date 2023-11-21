package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// MOstramos nuestro nombre tantas veces como indique el usuario.
		// Antes del nombre se muestra también el número de repetición.
		int contador = 1;

		System.out.println("¿Cuantas veces quieres que se muestre tu nombre?");
		int num = entrada.nextInt();

		while (contador <= num) {
			System.out.println(contador + " -Juanjo.");
			contador++;
		}
	}

}
