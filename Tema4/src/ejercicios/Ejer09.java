package ejercicios;

public class Ejer09 {

	public static void main(String[] args) {
		// Crea un método int max(int x, int y) que devuelva el mayor de los números x e
		// y.
		// Análogamente, crea el método int min(int x, int y).
		

		System.out.println("Número mayor: " + intMax( 9,5));
		System.out.println("Número menor: " + intMin(9,5));
	}

	static int intMax(int x, int y) {

		if (x > y) {
			return x;
		}
		return y;
	}

	static int intMin(int x, int y) {

		if (x < y) {
			return x;
		}
		return y;
	}

}
