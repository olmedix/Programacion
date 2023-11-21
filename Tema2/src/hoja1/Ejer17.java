package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige un numero de mes entre 1 y 12:");
		int numMes = entrada.nextInt();

		switch (numMes) {
		case 1:
			System.out.println("Has elegido el mes de enero ");
			break;
		case 2:
			System.out.println("Has elegido el mes de febrero ");
			;
			break;
		case 3:
			System.out.println("Has elegido el mes de marzo ");
			break;
		case 4:
			System.out.println("Has elegido el mes de abril ");
			break;
		case 5:
			System.out.println("Has elegido el mes de mayo ");
			break;
		case 6:
			System.out.println("Has elegido el mes de junio ");
			break;
		case 7:
			System.out.println("Has elegido el mes de julio ");
			break;
		case 8:
			System.out.println("Has elegido el mes de agosto ");
			break;
		case 9:
			System.out.println("Has elegido el mes de septiembre ");
			break;
		case 10:
			System.out.println("Has elegido el mes de octubre ");
			break;
		case 11:
			System.out.println("Has elegido el mes de noviembre ");
			break;
		case 12:
			System.out.println("Has elegido el mes de diciembre ");
			break;
		default:
			System.out.println("Número erroneo.");
		}
	}

}
