package cadenas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Programa que lea una contraseña y valide si cumple con una longitud mínima de 6 y
		// máxima de 12.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una contraseña de mínimo 6 y máximo 12 caracteres: ");
		String password = entrada.nextLine();
		int longitud = password.length();
		
		if(longitud<13 && longitud >5) {
			System.out.println("La contraseña cumple con los requisitos.");
		}else {
			System.out.println("Número de caracteres erróneo.");
		}
		

	}

}
