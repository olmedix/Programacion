package ejemplos;

public class Ejemplo13 {

	public static void main(String[] args) {
		
		String num1="10";
		String num2="50";
		
		//para convertir a entero utilizaremos Integer.parseInt()
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		System.out.println(numero1+numero2);
		
		// Para otros tipos usaremos:
		// Float.parseFloat()
		// Double.parseDouble()
		String precio= "20.25";
		
		float precioNumerico = Float.parseFloat(precio);
		

	}

}
