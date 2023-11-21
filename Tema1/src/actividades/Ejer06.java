package actividades;

import java.util.Scanner;
public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indica nombre del producto:");
		String producto = entrada.nextLine();
		
		System.out.print("¿ Precio del producto ?");
		double precio = entrada.nextDouble();
		
		System.out.print("¿ Número de unidades vendidas ?");
		int unidadVendida = entrada.nextInt();
		
		System.out.println("El coste total de " +producto + " es de " + precio*unidadVendida + "€");

		entrada.close();
	}

}
