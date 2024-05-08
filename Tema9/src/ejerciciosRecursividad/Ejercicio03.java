package ejerciciosRecursividad;

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println(aHex(15));
		// System.out.println(transforma(14));

	}

	private static String transforma(int n) {

		if (n > 1) {

			return "" + aHex(transforma(n / 16))  + n % 16;

		} else if (n == 1) {
			return "1";
		} else if (n == 0) {
			return "0";
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
