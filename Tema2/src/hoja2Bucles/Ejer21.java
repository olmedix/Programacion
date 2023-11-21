package hoja2Bucles;

import java.util.Scanner;

public class Ejer21 {



	public static void main(String[] args) {
	//Utiliza un bucle for para preguntar 5 veces por un número entero, 
	//y al final devolver la frase "Has fallado".
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Escribe el "+ i + " número entero:");
			int num = entrada.nextInt();
		}
		System.out.println("Has fallado!!");
		
	}

}
