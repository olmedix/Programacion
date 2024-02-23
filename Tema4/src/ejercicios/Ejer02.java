package ejercicios;

public class Ejer02 {

	public static void main(String[] args) {
		
		System.out.println(saludo("Carlos",50));

	}
	
	static String saludo(String nombre, int edad) {

		return "Hola, " + nombre + ", no parece que tengas " + edad + " años.";
	}

}
