package hoja2Bucles;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		// Crea un programa que solicite al usuario los precios de cuatro objetos 
		//y devuelva el precio total
		
		Scanner entrada = new Scanner(System.in);
		double precio=0;
		double precioTotal=0;
		
		for(int i=1;i<5;i++) {
			System.out.println("Escribe el "+ i + " precio:");
			precio = entrada.nextDouble();
			precioTotal =precioTotal + precio;
		}
		System.out.println("El precio total es de :" + precioTotal + "€");

	}

}
