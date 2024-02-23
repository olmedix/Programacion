package cadenas;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase: ");
		String frase = sc.nextLine();

		// meter las palabras en el array
		// el inicio será la posición 0 (primer caracter)
		int inicio = 0;

		// el fin será el espacio encontrado
		int fin = frase.indexOf(" ");

		//mientras se encuentre un espacio

		while (fin != -1) {

			System.out.println(frase.substring(inicio, fin));

			// hacemos que el inicio sea la siguiente posicion al espacio
			inicio = fin + 1;

			// buscamos el siguiente espacio, a partir de la posicion 
			// siguiente del anterior espacio
			fin = frase.indexOf(' ', inicio);

		}

		System.out.println(frase.substring(inicio));

	}

}