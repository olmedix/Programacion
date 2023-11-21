package actividades;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Escribe el segundo número:");
		double num2 = entrada.nextDouble();
		
		System.out.println("El resto de la división es: " +
		num1%num2);
		

	}

}
