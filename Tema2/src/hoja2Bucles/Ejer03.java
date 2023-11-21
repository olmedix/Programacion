package hoja2Bucles;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		// Escribe una aplicación que pregunte repetidamente un número entero hasta que
		// el usuario
		// escriba un valor entre 1 y 10. A continuación el programa escribirá un
		// mensaje informando del
		// número introducido.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un número entero:");
		int num = entrada.nextInt();
		
		while (num < 1 || num > 10) {
			System.out.print("Escribe un número entero:");
			num=entrada.nextInt();
			
		}
		System.out.println("Has introducido el : " + num);
	}

}
