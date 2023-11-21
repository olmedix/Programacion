package hoja1;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿ En que año estamos ?");
		int year = entrada.nextInt();

		System.out.println("Elige un numero de mes entre el 1 y el 12");
		int numMes = entrada.nextInt();

		switch (numMes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes elegido tiene 31 días.");
			break;
		case 2: 
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("El mes elegido tiene 29 días.");
			} else {
				System.out.println("El mes elegido tiene 28 días.");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes elegido tiene 30 días.");
			break;
		default:
			System.out.println("Número incorrecto.");
		}

	}

}
