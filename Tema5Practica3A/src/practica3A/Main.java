package practica3A;

public class Main {

	public static void main(String[] args) {

		String mensajeError = "¡Tu edad debe ser un número entero!";

		System.out.println("Escribe tu edad: ");
		int edad = Consola.leerInt(mensajeError);

		System.out.println("\nTu edad es " + edad + ".");
		
		System.out.println("\nEscribe tu edad: ");
		edad = Consola.leerInt();

		System.out.println("\nTu edad es " + edad + ".");
	}

}
