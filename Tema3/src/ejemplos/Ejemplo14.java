package ejemplos;

public class Ejemplo14 {

	public static void main(String[] args) {
		
		String[][] alturas= {
				{"Manuel","1.75"},
				{"Rosa","1.70"},
				{"María","1.65"},
				{"Jorge","1.72"},
		};
		
		float suma=0;
		int posMin=0;
		
		// Recorremos las filas.
		for (int i = 0; i < alturas.length; i++) {
			
			// Sumamos lo que haya en la columna 1 de la fila.
			suma += Float.parseFloat(alturas[i][1]);
			
			// Buscamos la altura mínima.
			if(Float.parseFloat(alturas[i][1]) < Float.parseFloat(alturas[posMin][1])) {
				posMin = i;
			}
			
		}
		
		System.out.println("Altura media: " + suma/alturas.length);
		System.out.println("Altura mínima: "+ alturas[posMin][1] + " metros. "
				+ "Que corresponde a " + alturas[posMin][0] + ".");

	}

}
