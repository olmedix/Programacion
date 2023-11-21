package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuantas veces quieres ver tu nombre en la pantalla?");
		int num = entrada.nextInt();
		int contador = 0;

		while (contador < num) {
			System.out.println("Juanjo");
			System.out.println(contador);
			contador++;

		}

	}

}
