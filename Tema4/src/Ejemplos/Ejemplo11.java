package Ejemplos;

public class Ejemplo11 {
	
	// Variable global: se puede utilizar en toda la clase.
	static int edad;
	
	public static void main(String[] args) {
		
		edad = 50;
		mostrarEdad();
		System.out.println("La edad es " + edad + " años.");
	}

	
	static void mostrarEdad() {

		System.out.println("La edad es " + edad + " años.");
		edad = 100;
		
	}
	
}
