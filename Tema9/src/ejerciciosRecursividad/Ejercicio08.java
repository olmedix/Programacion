package ejerciciosRecursividad;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int numero = 456;
		
		System.out.println(sumar(numero));

	}
	
	private static int sumar(int n) {
		
		if(n/10 > 0) {
			
			return  sumar(n%10) + sumar(n/10);
			
		}else {
			return n;
		}
	}

}
