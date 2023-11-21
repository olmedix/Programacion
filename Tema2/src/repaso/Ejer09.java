package repaso;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resultado=0;
		System.out.print("Escribe el dividendo:");
		int dividendo= entrada.nextInt();
		
		System.out.print("Escribe el divisor");
		int divisor = entrada.nextInt();
		
		resultado = dividendo - divisor;
		System.out.println(resultado);
		
		while(resultado > divisor) {
			
			resultado = resultado - divisor;
			System.out.println(resultado);
		}

	}

}
