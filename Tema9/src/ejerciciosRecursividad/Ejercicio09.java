package ejerciciosRecursividad;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int[] numeros = {3,5,2};
		int n = numeros.length-1;
		
		System.out.println("La suma del array da: " + sumar(numeros,n));

	}
	
	private static int sumar (int[] numeros,int n) {
		
		if(n<0) {
			return 0;
		}
		
		return numeros[n] + sumar(numeros, n-1) ;
		
		
	}

}
