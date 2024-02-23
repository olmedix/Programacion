package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] lista = new int[5];
		
		solicita(lista,entrada);
		ordena(lista);
		mostrar(lista);

	}

	
	static int[] solicita(int[] lista, Scanner entrada) {

		for (int i = 0; i < lista.length; i++) {

			System.out.print("Escribe  el número " + i + ": ");
			lista[i] = entrada.nextInt();
		}

		return lista;
	}
	
	static void ordena(int[] lista) {
		
		int posMin,aux;
		
		for (int i = 0; i < lista.length-1; i++) {
			posMin=i;
			
			for (int j = i+1; j < lista.length; j++) {
				
				if(lista[j] < lista[posMin]) {
					posMin=j;
				}
			}
			
			aux= lista[posMin];
			lista[posMin]=lista[i];
			lista[i]=aux;
		}
	}
	
	
	static void mostrar(int[] lista) {
		System.out.println(Arrays.toString(lista));
	}

}
