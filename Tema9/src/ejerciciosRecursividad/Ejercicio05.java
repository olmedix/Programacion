package ejerciciosRecursividad;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Escribe un método que calcule recursivamente la suma de todos los números enteros entre 1 y n.
		
		System.out.println(sumaEnteros(3));

	}
	
	private static int sumaEnteros(int n) {
		
		int contador=1;
		
		if(contador > n) {
			System.out.println("hola");
			return 0;
		}
		
		
		System.out.println(contador);
		
		return sumaEnteros(contador+(contador+1));
		
	}

}
