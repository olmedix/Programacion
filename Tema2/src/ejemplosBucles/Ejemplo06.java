package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {
		// Programa que vaya pidiendo nombres de personas al usuario
		// Cuando el usuario escriba "Pepe", el programa responderá con
		// "Ese nombre no me gusta " y terminará.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe nombres de personas: ");
		String nombre = "";

		while (!nombre.equals("Pepe")) {
			System.out.print("Nombre: ");
			nombre = entrada.nextLine();
			
			System.out.println("Nombre:" + nombre);
		}
		System.out.println("\nEse nombre no me gusta ");

	}

}
