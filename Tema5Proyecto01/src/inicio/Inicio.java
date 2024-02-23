package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Cilindro cilindro1 = new Cilindro();

		System.out.print("Escribe el radio: ");
		cilindro1.setRadio(entrada.nextInt());

		System.out.print("Escribe la altura: ");
		cilindro1.setAltura(entrada.nextInt());

		System.out.println("\nEl área de cilindro1 es " + cilindro1.getArea() + ".");
		System.out.println("El volumen de cilindro1 es " + cilindro1.getVolumen() + ".");

		System.out.print("\nEscribe el radio: ");
		int radio = entrada.nextInt();

		System.out.print("Escribe la altura: ");
		int altura = entrada.nextInt();

		Cilindro cilindro2 = new Cilindro(altura, radio);

		System.out.println("\nEl área de cilindro2 es " + cilindro2.getArea() + ".");
		System.out.println("El volumen de cilindro2 es " + cilindro2.getVolumen() + ".");

		System.out.println(cilindro2.toString());

	}

}
