package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12A {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = entrada.nextLine();
		frase.trim();
		int posEspacio = 0;
		int posEspacioSiguiente = frase.indexOf(" ");

		// Contamos cuantas palabras hay para crear luego una array de ese tamaño.
		int numPalabras = 0;
		boolean leyendoPalabras = false;

		for (int i = 0; i < frase.length(); i++) {

			// Si en i hay un carácter que no es espacio, lo indicamos
			// poniendo leyendo palabra a true. 
			if (frase.charAt(i) != ' ') {
				leyendoPalabras = true;

				// Y si estamos leyendo la primera palabra y encontramos un espacio
				// significa que acabamos de llegar al final de la primera palabra.
				if (numPalabras == 0) {
					numPalabras++;
				}
				
				// Si encontramos un espacio y estábamos leyendo una palabra,
				// significa que acabamos de leer una nueva palabra.
			} else if (frase.charAt(i) == ' ' && leyendoPalabras == true) {
				leyendoPalabras = false;
				numPalabras++;
			}

			System.out.println("Hay " + numPalabras + " palabras.");

			// Creamos el array de palabras y guardamos una en cada posición

			String[] palabras = new String[numPalabras];
			int cont = 0;

			while (posEspacioSiguiente != -1) {

				// Guardamos la palabra que hay entre los dos espacios.
				palabras[cont] = frase.substring(posEspacio, posEspacioSiguiente);

				// Actualizamos posEspacio que pasa a ser el inicio de la nueva búsqueda.
				posEspacio = posEspacioSiguiente + 1;

				// Buscamos la 
				posEspacioSiguiente = frase.indexOf(' ', posEspacio);
				cont++;
			}

			palabras[cont] = frase.substring(posEspacio);
			System.out.println(Arrays.toString(palabras));
		}

	}

}
