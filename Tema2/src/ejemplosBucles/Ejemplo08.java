package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {
		// Preguntamos al usuario cuál es la festividad equivalente 
		// a Halloween en España. Mientras no acierte ,
		//le repetimos la pregunta.
		Scanner entrada = new Scanner(System.in);
		String fiesta="";
		
		do {
			System.out.println("¿Cuál es la festividad equivalente a Halloween"
					+ "en España?");
			fiesta= entrada.nextLine();
		}while(!fiesta.toLowerCase().equals("todos los santos"));
		
		System.out.println("Correcto!!!");

	}

}
