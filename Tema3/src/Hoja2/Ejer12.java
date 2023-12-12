package Hoja2;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int[] numAtomicos = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int aux;
		int posMin;
		int minimo = 0;
		int maximo = 0;

		// Comenzamos  el bucle dandole valor a posMin = 0, en este caso sin length -1
		// para que luego podamos calcular el número máximo.
		for (int i = 0; i < numAtomicos.length ; i++) {
			posMin = i;

		//Comparamos toda la array con el primero e intercambiamos posición si es menor.
		// en la segunda vuelta y sucesivas se compara el segundo número con el resto de la array.
		// Tercera vuelta  el tercer número con el resto, etc.
			for (int j = i + 1; j < numAtomicos.length; j++) {

				// Cuando valor de "j" es menor que el valor de "posMin"
				// asignamos el número del dígito menor a "posMin"
				if (numAtomicos[j] < numAtomicos[posMin]) {
					posMin = j;
				}

			}
			
			
			// guardamos el valor de " numAtomicos[i] " en una variable auxiliar para no perder su valor.
			// Reasignamos valores para que queden ordenador de menor a mayor.
			aux = numAtomicos[i];
			numAtomicos[i] = numAtomicos[posMin];
			numAtomicos[posMin] = aux;
			
		}
		System.out.println(Arrays.toString(numAtomicos)+ "\n");
		System.out.println("Mínimo: " + numAtomicos[0] + " y máximo: " + numAtomicos[7]);
		
	}

}
