package Ejemplos;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		System.out.println("Sumamos dos números, 10 y 5 da " + sumar(10,5));
		
		int suma =sumar(8,5);
		System.out.println("La suma de 8 y 5 da " + suma);

	}
	
	// El método sumar recibe dos argumentos, a y b de tipo entero.
	// Muestra la suma de ambos números.
	// Devuelve la suma de a+b.
	static int sumar(int a, int b) {
		
		return a+b;
	
	}

}
