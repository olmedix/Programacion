package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		LocalDate[] fechas = new LocalDate[5];
		
		// Pedir por terminal als 5 fechas y guardarlas en el array.
		for (int i = 0; i < fechas.length; i++) {
			System.out.print("escribe una fecha(AAA-MM-DD): ");
			
			fechas[i] = LocalDate.parse(entrada.nextLine());
		}
		
		// Mostrar por terminal la lista de fechas
		System.out.println("\nFechas introducidas:");
		for (int i = 0; i < fechas.length; i++) {
			
			System.out.println(fechas[i]);
		}
		
		// Indicar la fecha más antigua
		int posMin=0;
		for (int i = 1; i < fechas.length; i++) {
			if(fechas[i].isBefore(fechas[posMin])) {
				posMin=i;
			}
		}
		
		System.out.println("\nLa fecha más antigua es " + fechas[posMin]);
		
	}

}
