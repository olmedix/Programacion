package ejemplosRecursividad;

public class Ejemplo01B {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

	private static int factorial(int n) {
		
		if(n > 0) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
		
	}
	
	
}
