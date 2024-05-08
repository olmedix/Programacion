package ejerciciosRecursividad;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		System.out.println(transforma(687));

	}

	private static String transforma(int n) {

		if (n > 1) {

			return "" + transforma(n / 16) + aHex(n % 16) ;

		} else if (n == 1) {
			return "1";
		} else if (n == 1 || n == 0) {
			return "" + n;

		} else {
			return "ERROR";
		}

	}

	// Devuelve un número entre 0 y 15 en hexadecimal.
	private static String aHex(int n) {

		String[] hexadecimales = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D",
				"E", "F" };

		return hexadecimales[n];

	}

}
