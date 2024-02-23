package examen;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un teléfono con el formato correcto: ");
		String telefono = entrada.nextLine();

		String[] numTelf = telefono.split("-");
		String prefijo = "";

		if (numTelf[0].length()==3) {
			prefijo = numTelf[0].substring(1);
		} else if(numTelf[0].length()==2) {
			prefijo = numTelf[0];
		}

		System.out.println("\nDatos del teléfono: ");

		System.out.println("\t* Prefijo de país: " + prefijo);
		System.out.println("\t* Teléfono: " + numTelf[1]);
		System.out.println("\t* Extensión: " + numTelf[2]);

	}

}
