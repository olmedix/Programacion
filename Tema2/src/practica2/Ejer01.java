package practica2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperatura = 0;
		int i = 0;

		while (i < 1) {
			System.out.print("Escribe la temperatura de la hacitación: ");
			temperatura = entrada.nextDouble();

				if (temperatura < 10) {
					System.out.println("Hace un frio que pela.");
				} else if (temperatura >= 10 && temperatura < 20) {
					System.out.println("No se está mal.");
				} else {
					System.out.println("Calorcillo");
				}
			
		}

	}

}
