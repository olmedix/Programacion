package ejerciciosRecursividad;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Crea un método int sumar(int[] lista, int n) que calcule la suma de los elementos de un array
		// lista de n números enteros.
		int n=4;
		int[] lista = new int[n];
		
		lista[0]=2;
		lista[1]=3;
		lista[2]=4;
		lista[3]=1;
		
		System.out.println("La suma es " + sumar(lista,n-1));

	}
	
	private static int sumar(int[] lista, int n) {
		
		
		if(n< 0) {
			return 0;
		}
		
		return sumar(lista, n-1) + lista[n] ;
		
		
	}

}
