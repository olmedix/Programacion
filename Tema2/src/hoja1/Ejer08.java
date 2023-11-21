package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Cómo se dice en inglés ordenador ?");
		String palabra = entrada.nextLine();
		
		if(palabra.toLowerCase().equals("computer")) {
			System.out.println("ENHORABUENA, ES CORRECTO!!!");
		}else {
			System.out.println("LO SIENTO, NO ES CORRECTO.");
		}
	}

}
