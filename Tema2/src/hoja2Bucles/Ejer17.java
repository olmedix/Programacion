package hoja2Bucles;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		// Crea un programa que pida un número y escriba la tabla de multiplicar de ese número.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Escribe el número y conoceras su tabla de multiplicar:");
		int num = entrada.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.println(num + " * " + i + " = "+ num * i);
		}

	}

}
