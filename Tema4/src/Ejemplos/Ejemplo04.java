package Ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {

		
		System.out.println("El doble de 8 es " + doblar(8));

		int doble = doblar(20);
		System.out.println("El doble de 20 es " + doble);

	}
	
	// El método doblar recibe un argumento, num de tipo entero.
	// Devuelve el doble de num.		
	static int doblar(int num) {
		
		return 2 * num;
	}

}
