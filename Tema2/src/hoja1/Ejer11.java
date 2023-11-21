package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿ Precio del producto ?");
		double precio = entrada.nextDouble();

		System.out.println("¿ Número de unidades ?");
		int unidad = entrada.nextInt();

		double compra = precio * unidad;

		if (compra < 100) {
			System.out.println("No llega al precio para ser aplicado el descuento");
		} else if (compra > 200) {
			System.out.println(
					"Tiene un descuento del 15%.\n" + "El precio final es de: " + (compra - (compra * 0.15)) + "€");
		} else {
			System.out.println(
					"Tiene un descuento del 10%.\n" + "el precio final es de: " + (compra - (compra * 0.1)) + "€");
		}
		System.out.println("Fin del programa!!");
	}

}
