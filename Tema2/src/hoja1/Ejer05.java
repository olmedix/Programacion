package hoja1;

import java.util.Scanner;
public class Ejer05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el numero del mes que desees");
		int numMes = entrada.nextInt();
		
		if(numMes >= 1 && numMes <=12 ) {
			System.out.println("Mes correcto");
		}else {
			System.out.println("Mes no valido.");
		}
	}

}
