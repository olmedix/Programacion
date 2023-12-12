package Hoja2;

import java.util.Scanner;

public class Ejer20 {
		
		public static void main(String[] args) {
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

			// Mostramos la tabla
			System.out.println("\nApellidos\tNombre\t\tSueldo");
			System.out.println("=================================================");
			for (int i = 0; i < nominas.length; i++) {

				for (int j = 0; j < nominas[0].length; j++) {

					System.out.print(nominas[i][j] + "\t\t");
				}
				System.out.println();
			}

			// Calculamos el el gasto mensual de la empresa sumando los sueldos.
			for (int i = 0; i < nominas.length; i++) {

				sueldoTotal += Double.parseDouble(nominas[i][2]);
			}

			System.out.println("\nEl gasto trimestral en sueldos es: " + sueldoTotal + "€.");

			// Buscamos el salario más bajo y lo mostramos junto a todos sus datos.
			for (int i = 0; i < nominas.length; i++) {
					
					if(Double.parseDouble(nominas[i][2]) <Double.parseDouble(nominas[posMin][2])) {
						
						posMin =i;
					}
			}
			System.out.println(nominas[posMin][1] + " " + nominas[posMin][0] +
					" tiene el salario más bajo, " + nominas[posMin][2] + "€.");
			
	}

}
