package ejemplosSets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejemplo01 {

	// Aplicación que vaya pidiendo nombres y los guarde pero sin guardar nombres
	// repetidos
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Set<String> nombres = new HashSet<>();
		String nombre = " ";

		// Vamos leyendo nombres de la terminal y guardándolos en el conjunto.
		while (!nombre.equals("")) {

			System.out.print("Escribe un nombre o pulsa enter para finalizar: ");
			nombre = entrada.nextLine();

			if (!nombre.equals("")) {
				nombres.add(nombre);
			}

			System.out.println("Hay " + nombres.size() + " nombres guardados.");
		}

		mostrar(nombres);

		// Eliminamos el nombre "Pedro"
		nombres.remove("Pedro");
		mostrar(nombres);

		// Eliminamos todo el contenido.
		nombres.clear();
		mostrar(nombres);

	}

	// Recorremos el set y mostramos sus valores.
	private static void mostrar(Set<String> nombres) {
		

		if (nombres.isEmpty()) {
			System.out.println("\nEl conjunto está vacio!!");
		}else

		System.out.println("\nNombres almacenados:");
		for (String palabra : nombres) {
			System.out.println(" * " + palabra);
		}
	}

}
