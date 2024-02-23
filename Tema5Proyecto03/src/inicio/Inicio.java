package inicio;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		java.util.Scanner entrada = new java.util.Scanner(System.in);

		// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.
		System.out.println("************ALTA DE AUTOR ***************\n");

		System.out.print("Nombre de autor: ");
		String nombre = entrada.nextLine();

		System.out.print("Email del autor: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento del autor: ");
		int anyo = entrada.nextInt();

		Autor autor1 = new Autor(nombre, email, anyo);

		System.out.println("\nDatos del autor: \n" + autor1.toString());

		// Leemos los datos de un libro( suponemos que del autor anterior)
		// los guardamos en un objeto Libro.
		System.out.println("\n************ALTA DE LIBRO ***************\n");

		// Limpiamos el buffer de entrada para evitar que se salte la siguiente lectura.
		entrada.nextLine();

		System.out.print("Título: ");
		String titulo = entrada.nextLine();

		System.out.print("ISBN: ");
		String isbn = entrada.nextLine();

		System.out.print("Año actual: ");
		int anyoActual = entrada.nextInt();

		Libro libro1 = new Libro(titulo, isbn, autor1);

		System.out.println("\nDatos del libro: \n" + libro1.toString());

	}

}
