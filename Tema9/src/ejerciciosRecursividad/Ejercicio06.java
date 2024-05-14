package ejerciciosRecursividad;

public class Ejercicio06 {

    public static void main(String[] args) {
        final int CAPACIDAD = 3;
        int[] numeros = new int[CAPACIDAD];

        numeros[0] = 4;
        numeros[1] = 5;
        numeros[2] = 3;

        System.out.println("Número menor: " + buscaMin(numeros, CAPACIDAD));
    }

    private static int buscaMin(int[] numeros, int CAPACIDAD) {
        // Caso base.
        if (CAPACIDAD == 1) {
            return numeros[0];
        }
        
        // Caso recursivo
        return Math.min(buscaMin(numeros, CAPACIDAD-1),numeros[CAPACIDAD-1]);
        
        
    }
}

