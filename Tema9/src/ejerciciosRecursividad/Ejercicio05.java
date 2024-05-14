package ejerciciosRecursividad;

public class Ejercicio05 {


	public static void main(String[] args) {

		// Escribe un método que calcule recursivamente la suma de todos los números
		// enteros entre 1 y n.

		System.out.println("El numero es " + sumaEnteros(3));

	}

	private static int sumaEnteros(int n) {

		if (1 <= n) {

			return sumaEnteros(n-1) +  n;
		} else {
			return 0;
		}
	}

}
