package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {
		// Bucle infinito que pregunte nombre sin parar.
		Scanner entrada = new Scanner(System.in);
		String nombre;
		
	//Cuando queramos un bucle infinito, usaremos 
	//while(true){...}
		while(true) {
			System.out.print("Escribe un nombre:");
			nombre = entrada.nextLine();
			
		}
	}

}
