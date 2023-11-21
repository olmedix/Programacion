import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*entrada.nextInt();
		entrada.nextFloat();
		entrada.nextLine(); */
		
		System.out.println("¿como te llamas?");
		String nombre = entrada.nextLine();
		
		//System.out.println("Te llamas " + nombre);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();
		
		//System.out.println("Tienes " + edad + " años.");
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
		

	}

}
