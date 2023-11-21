package hoja1;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿ En que idioma deseas recibir el buenos días ?:");
		System.out.println("1) Francés");
		System.out.println("2) Inglés");
		System.out.println("3) Alemán");
		System.out.println("4) Italiano");
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Bonjour");
			break;
		case 2:
			System.out.println("Good morning");
			break;
		case 3:
			System.out.println("Guten Morgen");
			break;
		case 4:
			System.out.println("Buongiorno");
			break;
		default:
			System.out.println("Buenos días");
			break;
		}
	}

}
