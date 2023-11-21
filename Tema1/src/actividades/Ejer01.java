package actividades;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribre el primer número:");
		int num1= entrada.nextInt();
		
		System.out.println("Escribe el segundo numero:");
		int num2= entrada.nextInt();
		
		System.out.println("El resultado de multiplicar " + num1+ " y " + num2 +
				" es: "+ num1*num2);
		
	}
	
}