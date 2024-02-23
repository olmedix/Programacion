package ejercicios;

public class Ejer07 {

	public static void main(String[] args) {
		
		System.out.println(celsius(20));

	}
	
	static double celsius(double gradosFahren){
		
		double celsius = (gradosFahren-32) * 5/9;
		
		return celsius ;
	}

}
