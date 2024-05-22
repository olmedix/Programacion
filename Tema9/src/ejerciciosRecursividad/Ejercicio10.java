package ejerciciosRecursividad;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribe un método int multiplicar(int[] lista, int n) que calcule la
		// multiplicación de los
		// elementos de un array lista de n números enteros.
		int[] lista = new int[3];
		int n = 3;

		lista[0] = 2;
		lista[1] = 2;
		lista[2] = 2;

		System.out.println("La multipliación: " + multiplicar(lista, n - 1));

	}

	public static int multiplicar(int[] lista, int n) {

		if (n <= 0) {
			return lista[n];
		}

		return lista[n] * multiplicar(lista, n - 1);
	}

}
