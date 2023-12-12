package Hoja1;

public class Ejer_Primo3 {

	public static void main(String[] args) {
		//Que muestre los 100 primeros numeros primos.
		
		final int CAPACIDAD=100;
        int num = 2;
        int j = 0;

        while (j < CAPACIDAD) {
            boolean esPrimo = true;

            for (int i = 2; i <= (num/2); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                
                System.out.println(num);
                j++;
            }
            
            num++;
        }

	}
}
