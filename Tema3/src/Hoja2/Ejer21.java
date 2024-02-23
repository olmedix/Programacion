package Hoja2;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		// Modifica el programa anterior de manera que haga las mismas funciones pero usando sólo dos
		// bucles: uno para leer los datos y luego otro para los cálculos. 

		Scanner entrada = new Scanner(System.in);

		String[][] nominas = new String[4][3];
		double sueldoTotal = 0;
		int posMin=0;

		// Cogemos los datos de los empleados por consola.
		for (int i = 0; i < nominas.length; i++) {

			System.out.print("Apellidos del empleado: ");
			nominas[i][0] = entrada.nextLine();

			System.out.print("Nombre del empleado: ");
			nominas[i][1] = entrada.nextLine();

			System.out.print("Sueldo del empleado: ");
			nominas[i][2] = entrada.nextLine();
		}

			for (int i = 0; i < nominas.length; i++) {
				
				//Calculamos el el gasto mensual de la empresa sumando los sueldos.
				sueldoTotal += Double.parseDouble(nominas[i][2]);
				
				// Buscamos el salario más bajo y lo mostramos junto a todos sus datos.
				if(Double.parseDouble(nominas[i][2]) <Double.parseDouble(nominas[posMin][2])) {
					
					posMin =i;
				}
			}

		System.out.println("\nEl gasto trimestral en sueldos es: " + sueldoTotal + "€.");

		System.out.println(nominas[posMin][1] + " " + nominas[posMin][0] +
				" tiene el salario más bajo, " + nominas[posMin][2] + "€.");
		
		
	}

}
