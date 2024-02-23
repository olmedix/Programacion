package ejemplo06Circulo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Circulo circulo1 = new Circulo(0,0,15);

		circulo1.x = 0;
		circulo1.y = 0;
		circulo1.radio = 15;

		System.out.println("El radio del círculo 1 es " + circulo1.radio);

		System.out.println("Área del círculo 1 es " + circulo1.area());

		System.out.println("Perímetro del círculo 1 es " + circulo1.perimetro());

		
		
		// Creamos un nuevo circulo y le preguntamos al usuario sus propiedades
		Circulo circulo2 = new Circulo();

		System.out.print("\nDime el valor de x de Circulo 2:");
		circulo2.x = entrada.nextDouble();

		System.out.print("\nDime el valor de y de Circulo 2:");
		circulo2.y = entrada.nextDouble();

		System.out.print("\nDime el valor del radio de Circulo 2:");
		circulo2.radio = entrada.nextDouble();

		System.out.println("\nEl radio del círculo 2 es " + circulo2.radio);

		System.out.println("Área de círculo 2 es " + circulo2.area());

		System.out.println("Perímetro de círculo 2 es " + circulo2.perimetro());

		
	}

}
