package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		final int SECRETO=7;
		
		System.out.println("Indica un número del 1 al 10");
		int num = entrada.nextInt();
		
		if(SECRETO == num) {
			System.out.println("ENHORABUENA HAS ACERTADO!!!");
		}else {
			System.out.println("LO SIENTO, HAS FALLADO!");
		}
	}

}
