package practica2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String estacion="";
		final String FINALIZA = "stop";
		
			do {
				System.out.print("¿Escribe el nombre de una estación del año:");
				estacion = entrada.nextLine();
				
				switch(estacion) {
				case "verano":
					System.out.println("El verano empieza el 21 de junio.");
					break;
				case "primavera":
					System.out.println("La primavera empieza el 20 de marzo.");
					break;
				case "otoño":
					System.out.println("El otoño empieza el 1 de septiembre.");
					break;
				case "invierno":
					System.out.println("El invierno empieza el 22 de diciembre.");
					break;
				default:
					System.out.println("Tienes que escribir el nombre de una estación.");
				}
				System.out.println("\nEscribre \"stop\" para salir del programa.");
				
			}while(!estacion.equals(FINALIZA));

			
			
	}

}
