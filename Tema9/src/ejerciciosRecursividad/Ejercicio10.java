package ejerciciosRecursividad;

public class Ejercicio10 {

	public static void main(String[] args) {

		int[] numeros = { 1, 5, 3 };
		int n = numeros.length - 1;

		System.out.println("La multipliación del array da: " + multiplicar(numeros, n));

	}
	
	private static int multiplicar(int[]numeros, int n) {
		
		if(n <= 0) {
			
			return numeros[0];
		}
		
		return numeros[n] * multiplicar(numeros, n-1);
	}

}
