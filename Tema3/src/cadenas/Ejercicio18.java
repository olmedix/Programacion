package cadenas;


public class Ejercicio18 {

	public static void main(String[] args) {
		// Coger una cadena y poner la primera letra de cada palabra en mayúsculas.

		String frase = "A quien madruga Dios le ayuda.";

		int fin=frase.indexOf(" ");
		int inicio=0;
		
		
		
		while(fin != -1){
			
			System.out.print(frase.toUpperCase().charAt(inicio));
			System.out.print(frase.substring(inicio+1,fin) + " "); 
			inicio=fin+1;
			
			fin = frase.indexOf(' ',inicio);
			
			
		}
		System.out.print(frase.toUpperCase().charAt(inicio));
		System.out.println(frase.substring(inicio+1));
			
			
			
		
		
			
			
		

	}

}
