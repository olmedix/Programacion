package hoja1;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿ Qué edad tienes ?");
		int edad = entrada.nextInt();
		
		boolean mayorEdad = (edad>=18)? true:false;
		
		System.out.println(mayorEdad);

	}

}
