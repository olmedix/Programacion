package ejemplosBucles;

public class Ejemplo15 {

	public static void main(String[] args) {
		// Muestre los números que son múltiplos de 5 pero 
		// no los de 50, Hasta el 200.
		
		int i=0;
		
		while(i < 200) {
			
			i += 5;
			
			if(i%50 ==0) {
		//La instruccion "continue" hace que el bucle vuelva a empezar.
				continue;
			}
			System.out.println(i);
			
			
		}

	}

}
