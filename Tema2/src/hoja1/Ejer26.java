package hoja1;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que calcule la hora de cierre de una tienda. 
		 * Esta hora depende del valor de una variable de tipo String llamada dia.
		 * Si su valor es "entre semana", la hora de cierre de la tienda será "20:00".
		 * En otro caso, la hora de cierre será "14:00"
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe \"entre semana\" u otra cosa para saber la hora del cierre:");
		String dia = entrada.nextLine();
		
		String cierre = dia.toUpperCase().equals("ENTRE SEMANA") ? "Cierra a las 20:00h":"Cierra a las 14:00";
		
		System.out.println(cierre);
	}

}
