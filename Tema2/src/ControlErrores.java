import java.util.Scanner;

public class ControlErrores {

	public static void main(String[] args) {
		final int VALOR_SECRET = 4;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Comencem el joc.");
		System.out.print("Endevina el valor enter, entre 0 i 10: ");
		boolean tipusCorrecte = entrada.hasNextInt();
		
		if (tipusCorrecte) {
			int valorUsuari = entrada.nextInt();
			entrada.nextLine();
			if (VALOR_SECRET == valorUsuari) {
				System.out.println("Exacte! Era " + VALOR_SECRET + ".");
			} else {
				System.out.println("T’has equivocat!");
			}
			System.out.println("Hem acabat el joc.");
		} else {
			System.out.println("El valor introduït no és un enter.");
		}
	}

}
