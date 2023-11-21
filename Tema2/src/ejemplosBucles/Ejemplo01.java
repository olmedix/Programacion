package ejemplosBucles;

public class Ejemplo01 {

	public static void main(String[] args) {
		System.out.println("Números del 1 al 5:");
	//La variable contador irá aumentando de 1 a 5.
		int contador = 1;

	//Se comprueba  si condición es menor o igual que 5 y
	//si es así, se ejecuta el bloque de instrucciones dentro del while.
		while (contador <= 5) {
			System.out.println(contador);
	//Se actualiza contador sumándole 1. En algún momento dejará
	//de cumplirse la condición del while y el bucle terminará.
			contador++;
		}
		
		System.out.println("hecho");

	}

}
