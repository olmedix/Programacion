package ejerciciosRecursividad;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		System.out.println(transforma(17));

	}

	private static String transforma(int n) {

		if (n > 15) {

			return transforma(n / 16) + aHex(n % 16) ;

		} else if (n == 1) {
			return "1";
		} else if (n>= 0 && n <= 15) {
			return "" + aHex(n);

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
