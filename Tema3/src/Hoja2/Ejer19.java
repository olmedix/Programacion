package Hoja2;


import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[][] nominas = new String[4][3];
		double sueldoTotal = 0;

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

		System.out.println("\nEl gasto mensual en sueldos es: " + sueldoTotal + "€.");

	}

}
