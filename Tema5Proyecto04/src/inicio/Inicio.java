package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		
		// Leemos los datos de los dos autores del libro.
		Autor autor1 = leerAutor();

		System.out.println("\nDatos del autor: \n" + autor1.toString());

		Autor autor2 = leerAutor();

		System.out.println("\nDatos del autor: \n" + autor2.toString());

		// Leemos los datos de un libro( suponemos que del autor anterior)
		// los guardamos en un objeto Libro.
		System.out.println("\n************ALTA DE LIBRO ***************\n");

		System.out.print("Título: ");
		String titulo = entrada.nextLine();

		System.out.print("ISBN: ");
		String isbn = entrada.nextLine();

		System.out.print("Año actual: ");
		int anyoActual = entrada.nextInt();

		// Creo una array con los autores del libro.
		Autor[] autores = { autor1, autor2 };

		Libro libro1 = new Libro(titulo, isbn, autores);

		System.out.println("\nDatos del libro: \n" + libro1.toString());
		
		System.out.println(libro1.muestraAutores());

	}

	// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.
	private static Autor leerAutor() {

		System.out.println("\n************ALTA DE AUTOR ***************\n");

		System.out.print("Nombre de autor: ");
		String nombre = entrada.nextLine();

		System.out.print("Email del autor: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento del autor: ");
		int anyo = entrada.nextInt();

		// Vaciamos el buffer de entrada para evitar que se salte el próximo nextLine().
		entrada.nextLine();

		return new Autor(nombre, email, anyo);

	}
	
	

}
