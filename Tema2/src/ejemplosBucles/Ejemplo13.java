package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule el resto de una división entre enteros con el procedimiento 
		 * de ir restando repetidamente el divisor del dividendo hasta que el 
		 * resultado es menor que el divisor.
				Ejemplo de esta operación: 20 % 6
					20 - 6 = 14
					14 – 6 = 8
					8 – 6 = 2 
			Ahí paramos, ya que la resta da un número menor que 6. El resto vale 2.
		 */
		Scanner entrada = new Scanner(System.in);
		int resto =0;
		
		System.out.println("escribe el número que deseas dividir:");
		int divisor = entrada.nextInt();
		
		System.out.println("Escribe el por el que deseas dividir:");
		int dividendo = entrada.nextInt();
		
		boolean parar =resto > dividendo;
		
		resto=divisor - dividendo;
		System.out.println(resto);
		
		while(parar) {
			resto=resto - dividendo;
			System.out.println(resto);
			if(resto > dividendo) {
				parar = false;
			}
		}
		System.out.println("Resto: " + resto);
	}

}
