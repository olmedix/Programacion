package ejercicios;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Escribe un método que escriba en pantalla el nombre de un mes a partir de su
		// número. En caso
		// de que el número proporcionado no esté entre 1 y 12, deberá terminar
		// inmediatamente.

		Scanner entrada = new Scanner(System.in);
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println("Escribe el número del mes que quieres que te muestre.");
		int num = entrada.nextInt();

		mostrarMes(num, meses);
	}

	static void mostrarMes(int numero, String[] mes) {

		if (numero < 1 || numero > 12) {

			return;
		}
		System.out.println(mes[numero - 1]);
	}

}
