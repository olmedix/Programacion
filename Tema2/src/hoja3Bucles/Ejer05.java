package hoja3Bucles;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=1;
		
		do {
			
			System.out.print("Escribe un número  para ver su tabla de multiplicar:\n ");
			num = entrada.nextInt();
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(num + " x " + i + " = " + num*i);
				System.out.println();
			}
			
		}while(!(num==0));

	}

}
