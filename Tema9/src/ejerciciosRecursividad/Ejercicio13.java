package ejerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Modifica el ejercicio anterior para que use Strings en lugar de arrays de
		// caracteres. Además, el
		// String lo introducirá el propio usuario y podrá incluir espacios (que el
		// programa le quitará antes de
		// comprobar si es palíndromo).
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una palabra y te diré si es un palindromo:");
		String frase = entrada.nextLine().trim();
		String frase2 = "dabale arroz a la zorra el abad";
		// frase2.trim();
		frase2 = quitaEspacios(frase2);
		System.out.println(frase2);
		int inicio = 0;
		int fin = frase2.length() - 1;

		System.out.println(esPalindromo(frase2, inicio, fin));

	}

	private static String quitaEspacios(String frase) {

		String fraseDevuelta = "";
		String[] nuevaFrase = frase.split(" ");

		for (int i = 0; i < nuevaFrase.length; i++) {
			fraseDevuelta = fraseDevuelta + nuevaFrase[i];
		}

		return fraseDevuelta;
	}

	private static boolean esPalindromo(String frase, int inicio, int fin) {

		if (inicio > fin) {
			return true;
		}

		if (frase.charAt(inicio) != frase.charAt(fin)) {
			System.out.println("i= " + inicio + "\tf= " + fin);
			return false;
		}

		return esPalindromo(frase, inicio + 1, fin - 1);

	}

}
