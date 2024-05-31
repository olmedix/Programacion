package ejerciciosRecursividad;

public class Ejercicio07 {

	public static void main(String[] args) {

		int numero = 456;

		System.out.println(invertir(numero));

	}

	private static String invertir(int n) {

		if(n / 10 > 0)
		return invertir(n % 10) + invertir(n / 10);
		else
			return "" + n;

	}

}
