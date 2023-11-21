
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		// Ejemplo de if  -  else if  -  else
		
		//Tenemos una rifa donde se saca un número de 4 cifras al azar.
		//Si el jugador acierta un número cobrará 10€
		//Si el jugador acierta dos números cobrará 30€
		//Si el jugador acierta tres números cobrará 50€
		//Si el jugador acierta cuatro números cobrará 100€
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ Cuantos números has acertado ?");
		int num = entrada.nextInt();
		
		if(num ==1) {
			System.out.println("Has ganado 10€");
		} else if(num == 2) {
			System.out.println("Has ganado 30€");
		} else if(num == 3) {
			System.out.println("Has ganado 50€");
		} else if(num == 4) {
			System.out.println("Has ganado 100€");
		} else {
			System.out.println("Sólo puede ser un número del 1 a 4");
		}
		
		System.out.println("Gracias por jugar.");
	}

}
