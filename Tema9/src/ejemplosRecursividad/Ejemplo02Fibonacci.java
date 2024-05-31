package ejemplosRecursividad;

public class Ejemplo02Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));

	}

	private static int fibonacci(int n) {
		System.out.println("fibonacci(" + n + ")");
		if (n > 1) {
			// caso recursivo

			return fibonacci(n - 1) + fibonacci(n - 2);
		} else {
			// caso base ( n=0 o n=1)
			return 1;
		}
	}

}
