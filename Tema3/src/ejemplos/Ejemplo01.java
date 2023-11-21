package ejemplos;

public class Ejemplo01 {

	public static void main(String[] args) {

	//Creamos un array con 10 posiciones de tipo float.
		float[] precios = new float[10];
		
	//Damos algunos valores al array.
		precios[0] = 10;
		precios[1] = 65;
		
	//Accedemos a los datos guardados en el array.
		System.out.println("Posición 0 : " + precios[0]);
		System.out.println("Posición 1 : " + precios[1]);
		
	//Al crear una array sus posiciones se inicializan a valores
	//por defecto (0 si es array númerico, false si es booleano y null si es de objetos).
		System.out.println("Posición 1 : " + precios[2]);
		
		
	}

}
