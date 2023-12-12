package cadenas;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Programa que lea una palabra desde la terminal y te diga cuántas letras tiene.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una palabra: ");
		String palabra = entrada.nextLine();
		int longitud = palabra.length();
		
		System.out.println("La palabra tiene " + longitud + " letras.");
		

	}

}
