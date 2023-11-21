package ejemplos;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		// Rellenar una array desde la terminal.
		Scanner entrada = new Scanner (System.in);
		
		String[] nombres = new String[4];
		
		System.out.println("Ve introduciendo nombres: ");
		
		//Vamos leyendo cada nombre y guardandolo en la posición i.
		for(int i=0;i<nombres.length;i++) {
			System.out.print("Nombre: ");
			nombres[i] = entrada.nextLine();
			
		}

		for(int i=0;i<nombres.length;i++) {
			System.out.print(nombres[i]+ "\t");
		}
	}

}
