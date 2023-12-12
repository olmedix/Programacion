package Hoja2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String[][] notas= new String[3][4];
		double notaFinal=0;
		
		//Cogemos los datos de todos los alumnos.
		for (int i = 0; i < notas.length; i++) {
			
			System.out.print("Nombre: ");
			notas[i][0] = entrada.nextLine();
			
			System.out.print("Exámenes: ");
			notas[i][1] = entrada.nextLine();
			
			System.out.print("Trabajos: ");
			notas[i][2] = entrada.nextLine();
			
			System.out.print("Actitud: ");
			notas[i][3] = entrada.nextLine();
		}
		
		//Calculamos la nota final de cada alumno.
		System.out.println("\nNota de evaluación");
		System.out.println("=====================");
		for (int i = 0; i < notas.length; i++) {
			
			notaFinal = (50 * Double.parseDouble(notas[i][1]) + 
					40 * Double.parseDouble(notas[i][2]) +
					10 * Double.parseDouble(notas[i][2]))/100;
			
			System.out.println(notas[i][0] + ":\t" + notaFinal);
		}
		
	}

}
