package hoja1;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int PREMIO = 3;
		System.out.println("Escribe un número");

		if (entrada.hasNextInt()) {
			int num = entrada.nextInt();
			if (num == PREMIO) 
				System.out.println(" Has acertado!    !!!!! ENHORABUENA !!!!");
								
		}else {
		 System.out.println("No has escrito un número.");

		}
	}

}
