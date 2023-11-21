package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final String CLAVE_REQUERIDA = "java8";
		final String NOMBRE_REQUERIDO = "juan";

		System.out.println("Escribre el nombre de usuario:");
		String usuario = entrada.nextLine();

		System.out.println("Escribe la clave de acceso: ");
		String clave = entrada.nextLine();

		if (clave.toLowerCase().equals(CLAVE_REQUERIDA) && usuario.toLowerCase().equals(NOMBRE_REQUERIDO)) {
			System.out.println("Acceso permitido!");
		} else {
			System.out.println("Aceso denegado!");
		}

	}

}
