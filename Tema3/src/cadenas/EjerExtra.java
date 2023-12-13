package cadenas;

import java.util.Scanner;

public class EjerExtra {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		// programa que busca una palabra detnro de una frase, mostrandonos todas las posiciones donde aparece
		
		String frase ="con la lluvia cayendo y con el lago llenadose de agua con sal.";
	
		System.out.print("Palabra: ");
		String palabra = entrada.nextLine();
		
		int posicion = frase.indexOf(palabra);
		
		if(posicion ==-1) {
			System.out.println("La palabra no aparece.");
		}
		
		while(posicion !=-1) {
			
			System.out.println("La palabra " + palabra + " aparece en la posición " 
			+ posicion);
			
			posicion = frase.indexOf(palabra,posicion+1);
		}
				
			
		
	}

}
