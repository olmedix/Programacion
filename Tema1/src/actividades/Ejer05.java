package actividades;

import java.util.Scanner;

public class Ejer05{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿ Nombre del producto en venta ?");
		String producto = entrada.nextLine();
		
		System.out.print("¿ Precio ?");
		float precio = entrada.nextFloat();
		
		System.out.print("¿ Que descuento hay que aplicar ?");
		float descuento = entrada.nextFloat();
		
		float cantidadDescuento = precio * descuento / 100;
		
		System.out.println("El/la " + producto + " , con el precio: " + precio + " y descuento: " 
		+ descuento + " tiene un precio final de : " + (precio-cantidadDescuento));
	}

}
