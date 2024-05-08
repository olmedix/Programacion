package ejerciciosRecursividad;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Crea una clase con un método:
			String transforma(int dato)
			que transforme un número entero en base diez a binario. Utiliza un procedimiento recursivo.*/
		
		System.out.println(transforma(10));

	}
	
	private static String transforma (int n) {
		
		if(n >1) {
			
			return ""+ transforma(n/2) + n % 2;
			
			
		}else if(n == 1 || n == 0) {
			return "" + n;
		
		}else {
			return "ERROR";
		}
	}

}
