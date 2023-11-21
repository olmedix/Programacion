package practica1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int segundos = 0;
		float total=0;

		for (int i = 1; i <= 8; i++) {
			System.out.print("Tiempo en segundos del " + i + " corredor:");
			segundos = entrada.nextInt();
			
			total +=segundos;
		}
		System.out.println("La suma total de tiempos es de: " + total +
				"\ny el tiempo medio es de:  "+ total/8);
	}

}
