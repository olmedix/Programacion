package hoja2Bucles;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		// Escribe un programa que calcule el resto de una división 
		//entre enteros con el procedimiento de ir
		//restando repetidamente el divisor del dividendo hasta que
		//el resultado es menor que el divisor.
		Scanner entrada = new Scanner(System.in);
		int resto =0;
		
		System.out.println("escribe el número que deseas dividir:");
		int divisor = entrada.nextInt();
		
		System.out.println("Escribe el por el que deseas dividir:");
		int dividendo = entrada.nextInt();
		
		resto=divisor - dividendo;
		System.out.println(resto);
		
		while(resto > dividendo) {
			resto=resto - dividendo;
			System.out.println(resto);
		}
		System.out.println("Resto: " + resto);
	}

}
