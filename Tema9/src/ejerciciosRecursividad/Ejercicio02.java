package ejerciciosRecursividad;

public class Ejercicio02 {

	public static void main(String[] args) {

		System.out.println(transforma(10));

	}

	private static String transforma(int n) {

		String resultado = "";
		
		if(n==0) {
			return "0";
		}else if(n <0) {
			return "ERROR";
		}

		while(n != 0) {
			
			resultado = n % 2 + resultado;

			n = n / 2;
		}

		return resultado;

	}

}
