package actividades;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Escribe el segundo número:");
		double num2 = entrada.nextDouble();
		int resultado = (int) (num1/num2);
		
		System.out.println("El cociente es: " + resultado + " \ny el resto es: "
				+ num1%num2
				);
		

	}

}
