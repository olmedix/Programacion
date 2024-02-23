package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		
		
		System.out.println(escribeNombre());
	}

	
	static String escribeNombre () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();
		
		return nombre;
	}
	
	
}
