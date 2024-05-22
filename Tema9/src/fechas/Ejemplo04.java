package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		LocalDate[] fechas = new LocalDate[5];
		
		fechas[0]= LocalDate.parse("2024-01-01");
		fechas[1]= LocalDate.parse("2025-01-01");
		fechas[2]= LocalDate.parse("2022-01-01");
		fechas[3]= LocalDate.parse("2027-01-01");
		fechas[4]= LocalDate.parse("2023-01-01");
		
		// Pedir por terminal als 5 fechas y guardarlas en el array.
//		for (int i = 0; i < fechas.length; i++) {
//			System.out.print("escribe una fecha(AAA-MM-DD): ");
//			
//			fechas[i] = LocalDate.parse(entrada.nextLine());
//		}
		
		ordenarMin(fechas);
		
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
	
	private static void ordenarMin(LocalDate[] fechas) {
		int posMin;
		LocalDate aux;
		
		for (int i = 0; i < fechas.length-1; i++) {
			posMin=i;
			
			for (int j = i; j < fechas.length; j++) {
				if(fechas[j].isBefore(fechas[posMin])) {
					posMin=j;
				}
			}
			aux=fechas[posMin];
			fechas[posMin]=fechas[i];
			fechas[i]=aux;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
