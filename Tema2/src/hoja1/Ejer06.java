package hoja1;

import java.util.Scanner;
public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Precio del producto ?");
			float precio = entrada.nextFloat();
		
		System.out.println(" ¿ Número de unidades compradas ?");
			int cantidad = entrada.nextInt();
		
			float totalCompra = precio * cantidad;
		
		if(totalCompra > 75) {
			totalCompra = (totalCompra-(totalCompra*0.15F));
			
			System.out.println("El precio final con descuento (15%) es: " +totalCompra);
			
		}else {
			totalCompra = (totalCompra-(totalCompra*0.05F));
			
			System.out.println("El precio final con descuento (5%) es: " + totalCompra);
		}
	}

}
