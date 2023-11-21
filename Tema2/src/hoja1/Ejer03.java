package hoja1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Precio del producto ?");
		 float precio = entrada.nextFloat();
		 
		 if (precio > 80) {
				System.out.println("precio final es de: " + (precio - (precio * 0.1)) + "€");
			}
		 
		 if(precio < 5) {
			 System.out.println("precio final es de: " + (precio+2) +"€");
		 }

	}

}
