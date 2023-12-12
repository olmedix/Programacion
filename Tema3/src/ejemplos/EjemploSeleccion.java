package ejemplos;

import java.util.Arrays;

public class EjemploSeleccion {

	public static void main(String[] args) {

		// Intercambiar los valores de dos variables.
		int a = 10;
		int b = 25;
		int aux;
		// b valga 10 y a valga 25.
		aux = a;
		a = b;
		b = aux;
		System.out.println("A= " + a + "\tB= " + b);

		// Haremos lo mismo intercambiando dos posiciones de un array

		String[] mascotas = { "Perro", "Gato", "Hamster", "Ardilla", "Conejo" };

		// Intercambiamos la posición 1 (Gato) por 3 (Ardilla)

		String aux2;
		System.err.println(Arrays.toString(mascotas));
		aux2 = mascotas[1];
		mascotas[1] = mascotas[3];
		mascotas[3] = aux2;
		
		System.err.println(Arrays.toString(mascotas));

	}

}
