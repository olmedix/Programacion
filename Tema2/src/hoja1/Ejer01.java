package hoja1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Temperatura del reactor ?");
		float temp = entrada.nextFloat();
		
		if(temp >= 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA "
					+ "¡CORRED INSENSATOS!");
		}

	}

}
