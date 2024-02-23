package ejercicios;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		System.out.println("Escribe el planeta que deseas buscar:");
		String planetaBuscado = entrada.nextLine();

		System.out.println(buscaPlanetas(planetas, planetaBuscado));

	}

	static int buscaPlanetas(String[] planetas, String planetaBuscado) {

		for (int i = 0; i < planetas.length; i++) {

			if (planetas[i].equals(planetaBuscado)) {
				return i;
			}
		}

		return -1;

	}

}
