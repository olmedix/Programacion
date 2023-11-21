package hoja1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una contraseña");
		String password = entrada.nextLine();
	// Al ser String para comparar hay que utilizar
	// el método EQUALS.
		if(password.equals("1234")) {
			System.out.println("Acceso concedido.");
		}else {
			System.out.println(" denegado");
		}

	}

}
