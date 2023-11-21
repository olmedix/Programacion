package hoja1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el número del mes que desea.");
		int numMes = entrada.nextInt();

		if (numMes == 1) {
			System.out.println("enero");
		} else if (numMes == 2) {
			System.out.println("Febrero");
		} else if (numMes == 3) {
			System.out.println("Marzo");
		} else if (numMes == 4) {
			System.out.println("Abril");
		} else if (numMes == 5) {
			System.out.println("Mayo");
		} else if (numMes == 6) {
			System.out.println("Junio");
		} else if (numMes == 7) {
			System.out.println("Julio");
		} else if (numMes == 8) {
			System.out.println("Agosto");
		} else if (numMes == 9) {
			System.out.println("Septiembre");
		} else if (numMes == 10) {
			System.out.println("Octubre");
		} else if (numMes == 11) {
			System.out.println("Noviembre");
		} else if (numMes == 12) {
			System.out.println("Diciembre");
		} else {
			System.out.println("Número incorrecto!");
		}
	}

}
