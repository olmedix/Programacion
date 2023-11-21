package hoja2Bucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		//Modifica el programa anterior para que pida un carácter y también el número de veces que
		//queremos repetirlo.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un carácter:");
		String letra = entrada.next();
		
		System.out.print("¿Cuantas veces quieres que se repita?");
		int num = entrada.nextInt();
		int contador = 1;

		while (contador <= num) {
			System.out.println(contador + ": " + letra);

			contador++;
		}
	}

}
