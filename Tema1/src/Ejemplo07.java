
public class Ejemplo07 {

	public static void main(String[] args) {
		
		//Operaciones aritméticas con enteros.
		int a = 20 , b = 7;
		
		int suma = a + b;
		int resta = a - b;
		int producto = a * b;
		int div = a / b;
		
		int modulo = a % b; // Devuelve el resto ( es decir lo que sobra de la división ).
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("División entera: " + div);
		System.out.println("Módulo: " + modulo);

		System.out.println();
		//Operadores relacionales.
		
		
		
		boolean resultado = (a==b);
		System.out.println(resultado);
		
		resultado = (a!=b);
		System.out.println(resultado);
		
		resultado =(a > b);
		System.out.println(resultado);
		
		int c = 10, d = 10;
		
		resultado = (c >= d);
		System.out.println(resultado);
	}

}
