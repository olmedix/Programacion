package practicaEntrega;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int producto;
		double dinero = 0;

		System.out.println("===== MÁQUINA EXPENDEDORA =====\n");
		System.out.println("Productos a la venta:");
		System.out.println("==========================");
		System.out.println("(1) Lata 33 cl Coca-Cola   1,30 €");
		System.out.println("(2) Lata 33 cl Aquarius      1,50 €");
		System.out.println("(3) Patatillas onduladas     2 €");
		System.out.println("(4) Botella 50 cl agua        1 €");

		System.out.print("\nElige el número del producto que deseas comprar:\n ");
		producto = entrada.nextInt();

		while (producto < 1 || producto > 4) {

			System.out.println("El producto indicado no existe.");
			System.out.print("\n¿Qué quiere comprar? ");
			producto = entrada.nextInt();

		}

		System.out.print("¿Cuánto dinero quiere introducir?: ");
		dinero = entrada.nextDouble();

		while (dinero <= 0) {

			System.out.println("Debe introducir una cantidad válida (mayor o igual a cero).\n");
			System.out.print("¿Cuánto dinero quiere introducir?: ");
			dinero = entrada.nextDouble();
		}

	}

}
