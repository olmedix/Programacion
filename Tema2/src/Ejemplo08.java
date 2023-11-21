import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un número y te diré su cuadrado:");
		
// Al ejecutar hasNextFloat() el programa se y lo que escriba el usuario
//se va al buffer de entrada.
//Además , hasNextFloat() devuelve true o false diciéndonos si lo 
// que ha escrito el usuario es un float o no.
 		if(entrada.hasNextFloat()) {
 			
 	        //Con la siguiente instrucción el float que ha escrito el 
 	        //usuario se guarda en la variable num.
			float num = entrada.nextFloat();	
			System.out.println("El cuadrado de "+ num + " es " + num*num);
		}else {
			System.out.println("No has escrito un número!");
		}
		
		
		
	}

}
