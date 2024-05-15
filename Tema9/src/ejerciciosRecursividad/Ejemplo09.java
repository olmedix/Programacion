package ejerciciosRecursividad;

public class Ejemplo09 {

	public static void main(String[] args) {

		int[] lista = { 4, 5, 6 };

		System.out.println("Suma de los elementos: " + sumar(lista, 3));

	}

	private static int sumar(int[] lista, int n) {

		if (n > 0) {
			
			return lista[n - 1] + sumar(lista, n - 1);

		}

		return 0;
	}

}
