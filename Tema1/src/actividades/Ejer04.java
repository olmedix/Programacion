package actividades;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Nombre del alumno ?");
		String nombre = entrada.nextLine();
		
		System.out.print("inserta la nota de la primera evaluación:");
		int num1 = entrada.nextInt();
		
		System.out.print("inserta la nota de la segunda evaluación:");
		int num2 = entrada.nextInt();
		
		System.out.print("inserta la nota de la primera evaluación:");
		int num3 = entrada.nextInt();
		
		System.out.println("La nota media de " + nombre + " de las tres evaluaciones es: "+ (num1+num2+num3)/3);


	}

}
