package ejerciciosRecursividad;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Escribe una función boolean esPalindromo(char[] frase, int inicio, int fin)
		// que tome un array de
		// caracteres, junto a sus posiciones inicial y final, y devuelva true si es un
		// palíndromo (se lee igual de
		// derecha a izquierda) o false en caso contrario.

		char[] frase = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V', 'I', 'L', 'L', 'A' };
		int inicio = 0;
		int fin = frase.length - 1;

		System.out.println(esPalindromo(frase, inicio, fin));

	}

	private static boolean esPalindromo(char[] frase, int inicio, int fin) {

		// Caso base.
		if (inicio > fin) {
			return true;
		}

		// Caso recursivo
		if (frase[inicio] != frase[fin]) {

			return false;
		}

		return esPalindromo(frase, inicio + 1, fin - 1);

	}

}
