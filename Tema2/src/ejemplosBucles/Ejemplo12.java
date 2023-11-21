package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {
		// Escribe una aplicación que pregunte al usuario un número entre 1 y 5.
				// Si responde "3", se le felicitará por haber acertado.
				// Si no, se le seguirá pidiendo más números
				Scanner entrada = new Scanner(System.in);
				int num = 0;

				// Una variable semáforo es siempre booleana
				boolean pararDePreguntar = false;

				do {
					System.out.print("Di un número entre 1 y 5: ");
					num = entrada.nextInt();

				//Cuando se cumpla la condición de parada (num ==3)
				//cambiamos el valor de la variable semáforo, para que
				//la condición del bucle sea falsa y termine.
					if (num == 3) {
						pararDePreguntar = true;
					}
				//Ponemos exclamación(NOT) para que si pararDePreguntar es true.
				//la condición sea false y el bucle termine.
				} while (!pararDePreguntar);

				System.out.println("Enhorabuena");
	}

}
