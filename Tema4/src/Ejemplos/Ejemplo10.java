package Ejemplos;

import java.util.Arrays;

public class Ejemplo10 {

	public static void main(String[] args) {

		int edad = 40;

		String[] nombres = { "Pablo", "Juan", "Mario", "Laura", "Rosa" };

		mostrarEdad(edad);

		primerNombre(nombres);

		// Comprobamos si edad y nombres han variado después
		// de los cambios que se le han hecho en los métodos.
		System.out.println("El valor de edad es " + edad +".");
		System.out.println("El valor de edad es:\n " + Arrays.toString(nombres));
	}

	static void mostrarEdad(int edad) {

		System.out.println("La edad es " + edad + " años.");
		edad = 100;
	}

	static void primerNombre(String[] nombres) {
		System.out.println("El primer nombre de la lista es " + nombres[0] + ".");

		nombres[0] = "Carlos";
	}

}
