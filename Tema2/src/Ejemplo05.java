import java.util.Scanner;

public class Ejemplo05 {
	
	//programa que te pregunte el color de un semáforo y te diga si
	//tienes que pasar ,frenar o si te da tiempo
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿ En qué color está el semáforo ?");
		String color = entrada.nextLine();
		
		color = color.toLowerCase();
		
		if(color.equals("rojo")) {
			System.out.println("Alto!! no puedes pasar.");
		}else if(color.equals("naranja")) {
			System.out.println("Frena, se va a poner rojo.");
		}else if(color.equals("verde")){
			System.out.println("Adelante, puedes pasar.");
		}

	}

}
