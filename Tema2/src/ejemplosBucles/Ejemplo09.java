package ejemplosBucles;

public class Ejemplo09 {

	public static void main(String[] args) {
		//El método Math.random() devuelve un número mayor o igual a 0
		//y menor que 1.
		int contador =1;
		
//		while(contador<=10) {
//		System.out.println(Math.random());
//		
//		contador++;
//		}
		System.out.println("\n");
	//Si multiplicamos Math.random() por 2 y le sumamos 1
	//obtendremos números decimales mayores o iguales a 1 y menores que 3.
			
		while(contador<=10) {
			int numAleatorio =(int) (10* Math.random() + 1);
		System.out.println(numAleatorio);
		
		contador++;
		}
	}

}
