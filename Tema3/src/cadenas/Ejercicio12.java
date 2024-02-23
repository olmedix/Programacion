package cadenas;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra " + (i + 1)+": " + palabras[i]);
        }
    }
}
