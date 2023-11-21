package hoja1;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Cómo te llamas ?");
		String nombre = entrada.nextLine();
		
		nombre =nombre.equals("")? "desconocido":nombre;
		System.out.println(nombre);
	}

}
