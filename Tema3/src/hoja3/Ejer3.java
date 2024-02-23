package hoja3;

import java.util.Arrays;

public class Ejer3 {

	public static void main(String[] args) {
		
		double[] cotizaciones = {47.5,47.8,48,48.1,47.7,47.3,
				46,47.9,48.05,48.7};
		
		int posMin;
		double aux;
		
		for (int i = 0; i < cotizaciones.length-1; i++) {
			
			posMin=i;
			
			for (int j = i+1; j < cotizaciones.length; j++) {
				
				if(cotizaciones[j] < cotizaciones[posMin]) {
					posMin=j;
				}
			}
			
			aux = cotizaciones[posMin];
			cotizaciones[posMin] = cotizaciones[i];
			cotizaciones[i] = aux;
		}
		
		System.out.println(Arrays.toString(cotizaciones));
	}

}
