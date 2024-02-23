package cadenas;


public class Ejercicio18 {

	public static void main(String[] args) {
		// Coger una cadena y poner la primera letra de cada palabra en mayúsculas.

		String frase = "A quien madruga Dios le ayuda.";

		int fin=frase.indexOf(" ");
		int inicio=0;
		
		
		
		while(fin != -1){
			
			// con UpperCase ponemos mayúscula y con charAT 
			// le decimos que  tiene que ser la primera letra
			System.out.print(frase.toUpperCase().charAt(inicio));

			// A continuación le pedimos que escriba a partir desde inicio +1 hasta 
			// el siguiente espacio. 
			System.out.print(frase.substring(inicio+1,fin) + " "); 
			inicio=fin+1;
			
			// Actualizamos el fin de palabra. Hasta que devuelva -1
			// para salir del bucle.
			fin = frase.indexOf(' ',inicio);
			
			
		}
		System.out.print(frase.toUpperCase().charAt(inicio));
		System.out.println(frase.substring(inicio+1));
			
			
			
		
		
			
			
		

	}

}
