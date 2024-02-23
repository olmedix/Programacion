package practica3A;

import java.util.Scanner;

public class Consola {

	private static Scanner entrada = new Scanner(System.in);

	public static int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {

			// Ponemos la entrada arriba para limpiar el buffer y no repetir el mensaje.
			entrada.nextLine();

			System.out.println(mensajeError);

		}
		
		int num=entrada.nextInt();
		
		entrada.nextLine();
		
		return num;
	}

	public static int leerInt() {

		return leerInt("Entrada incorrecta: se esperaba un número entero.");
	}
}
