package ejercicios;

public class Ejer05 {

	public static void main(String[] args) {
		
		System.out.println(numCubo(3));
	}
	
	static double numCubo(double num) {
		
		num= Math.pow(num,3);
		
		return num;
	}

}
