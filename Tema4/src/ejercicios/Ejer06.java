package ejercicios;

public class Ejer06 {

	public static void main(String[] args) {
		
		System.out.println(fahrenheit(20));

	}
	
	static double fahrenheit(double temperatura) {
		
		double gradosFa = temperatura * 9/5 +32;
		
		return gradosFa;
	}

}
