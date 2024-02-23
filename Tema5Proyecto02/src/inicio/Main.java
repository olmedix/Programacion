package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una distancia en quilómetros: ");
		double km = entrada.nextDouble();

		System.out.println(km + " pasados a millas son: " + Conversor.millas(km));

		System.out.print("Escribe  una presión en milibares: ");
		double milibar = entrada.nextDouble();

		System.out.println(milibar + " pasados a atmósferas da un resultado de " + Conversor.atmosferas(milibar));
	
		System.out.print("Escribe una cantidad en calorías: ");
		double caloria= entrada.nextDouble();
		
		System.out.println(caloria + " pasados a julios son " + Conversor.julios(caloria) );
	}

}
