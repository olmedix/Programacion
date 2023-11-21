import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** PORTERO DE DISCOTECA ***");

		System.out.println("¿ Qué edad tienes ?");
		int edad = entrada.nextInt();

		if (edad >= 18) {
			System.out.println("Puedes pasar");
			System.out.println("Gracias por venir.");
		} else if (edad < 5) {
			System.out.println(" eres un bebe");
		}

		else {
			System.out.println("No tienes la edad suficiente, no puedes pasar!");
		}

		System.out.println("Fin del programa.");

	}

}
