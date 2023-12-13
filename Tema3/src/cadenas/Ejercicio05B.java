package cadenas;

import java.util.Scanner;

public class Ejercicio05B {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();
		int longitud = frase.length();
		int contador = 1;

        frase.trim();

		for (int i = 0; i < longitud; i++) {

			if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ') {

				contador++;
			}

		}
		System.out.println("La frase tiene " + contador + " palabras.");

    }
}
