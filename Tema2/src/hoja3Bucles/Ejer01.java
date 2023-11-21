package hoja3Bucles;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que invente un nº aleatorio entre 1 y 10. 
		 * El usuario tendrá que adivinarlo en tres intentos como máximo. 
		 * Al finalizar el programa se le dirá si ha acertado el número y en cuántos 
		 * intentos lo ha hecho. Utiliza while y break.
			
			Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden
			Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10,
			ambos inclusive:
			(int) (Math.random()*10 + 1)
		 */
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int)(Math.random()*10+1);
		int i=1;
		int num=0;
		
		System.out.println(aleatorio);
		while(i<=3) {
			System.out.print("Adivina el número secreto: ");
			num= entrada.nextInt();
			
			if(num == aleatorio) {
				System.out.println("Has acertado en el intento "+ i);
				break;
			}
			
			i++;
		}
		if(!(num == aleatorio)) {System.out.println("Lo siento no has acertado.");
		}
	}

}
