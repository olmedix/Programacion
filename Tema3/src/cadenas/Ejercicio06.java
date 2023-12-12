package cadenas;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Programa que pide una frase y dos letras. A continuación muestra la frase
		// sustituyendo
		// la primera letra por la segunda.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		System.out.print("Escribe la letra que quieres cambiar: ");
		String letraOriginal = entrada.nextLine();

		System.out.print("Escribe la letra que quieres por la que quieres actualizar: ");
		String letraNueva = entrada.nextLine();

		
		String nuevaFrase = frase.replace(letraOriginal, letraNueva);

		System.out.println(nuevaFrase);

	}

}
