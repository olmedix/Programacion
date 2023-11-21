import java.util.Scanner;

public class Ejemplo07 {
//Programa que pregunta de que provincia eres 
// y te responde un mensaje adecuadao
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ En que provincia naciste ?");
		String provincia = entrada.nextLine();
		
		provincia = provincia.toUpperCase();
		switch(provincia) {
		
		case "ALICANTE":
			System.out.println("Eres alicantino");
			break;
		case "VALENCIA":
			System.out.println("Eres valenciano");
			break;
		case "CASTELLON":
			System.out.println("Eres castellonense");
			break;
		default:
			System.out.println("lo siento, no conozco esa provincia.");
		}

	}

}
