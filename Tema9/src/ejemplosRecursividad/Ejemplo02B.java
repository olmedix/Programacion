package ejemplosRecursividad;

public class Ejemplo02B {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(3));

	}
	
	private static int fibonacci(int n) {
		
		if(n > 0) {
			return fibonacci(n-1) + fibonacci(n-2);
		}else {
			return 1;
		}
	}

}
