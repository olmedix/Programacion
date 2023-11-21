import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {
		/*
		 * Programa que pregunta al usuario una temperatura - si el usuario no escribe
		 * un número el programa le informará de su torpeza. - si el valor de la
		 * temperatura es menor de 15 grados, le dirá que hace fresquito. - si el valor
		 * está entre 15 (inclusive) y 25 grados (no incluido) le dirá que hace buen
		 * tiempo. - si hace 25 grados o más le dirá que hace calor.
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una temperatura:");

		if (entrada.hasNextFloat()) {
			float temperatura = entrada.nextFloat();
			if (temperatura < 15) {
				System.out.println("Hace fresquito!");
			} else if (temperatura >= 15 && temperatura < 25) {
				System.out.println("Hace buen tiempo!");
			} else if (temperatura >= 25) {
				System.out.println("Hace calor!");
			}
		} else {
			System.out.println("No has escrito una temperatura en números...");
		}

	}

}
