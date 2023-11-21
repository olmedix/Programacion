package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
	//Programa que pide 10 nombre. si uno de los nombres es "PARAR",
    //el bucle termina en ese mismo momento

        Scanner entrada = new Scanner(System.in);
        String nombre;
       
        for (int i=1; i<=10;i++){
            System.out.print("Escribe un nombre: ");
            nombre= entrada.nextLine();

            if(nombre.equals("parar")){
                System.out.println("Parando.");
     //La instrución "break" hace que el bucle termine de golpe.
                break;
            }
        }

        System.out.println("Gracias por escribir estos nombres.");


	}
}
