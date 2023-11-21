package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {
		// vamos a pedirle a un usuario que escriba un número entre 1 y 4
		//si se equivoca, le repetiremos la pregunta hasta que 
		//introduzca un número válido
		Scanner entrada = new Scanner(System.in);
		int num=0;
		
		do {
		System.out.println("Escribe un número entre 1 y 4:");
		num = entrada.nextInt();
	
		}while(num < 1 || num > 4);
		
		System.out.println("Has introducido un número correcto.");
	}

}
