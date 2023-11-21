import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Dada una compra, si supera los 100 euros tendrá un descuento
		// del 10%, si no, lo tendrá del 5%
		
		System.out.println("Escribe el precio de la compra:");
		double compra= entrada.nextDouble();
		
		double precioFinal = compra>100 ? compra-(compra*0.1):compra-(compra*0.05);
		
		System.out.println("El precio final es de : "+ precioFinal);

	}

}
