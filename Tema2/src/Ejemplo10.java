import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {
		// Programa que pida dos números enteros y nos devuelva la suma.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe dos números enteros que desees sumar:");
		//Pedimos un número entero. Si el usuario se equivoca el programa termina.
		if (entrada.hasNextInt()) {
			int num = entrada.nextInt();
			//Pedimos un número entero. Si el usuario se equivocael programa termina.
			if (entrada.hasNextInt()) {
				int num2 = entrada.nextInt();
				System.out.println("La suma de " + num + " y " + num2 + " es: " + (num + num2));
			} else {
				System.out.println("No has escrito un número");
				System.exit(0);
			}
		} else {
			System.out.println("No has escrito un número");
			System.exit(0);
		}

	}

}
