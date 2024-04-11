package ejemplo05Interfaces;

import utilidades.Consola;

public class Main2 {

	public static void main(String[] args) {

		int mes = Mes.FEBRERO;

		System.out.println("¿En qué número de mes estamos?");
		int numMes = Consola.leerInt();
		
		if(numMes == Mes.MARZO) {
			System.out.println("Estamos en marzo");
		}

	}

}
