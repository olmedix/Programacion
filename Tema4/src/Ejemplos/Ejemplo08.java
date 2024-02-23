package Ejemplos;

public class Ejemplo08 {

	public static void main(String[] args) {

		System.out.println("El area de un triangulo es " + areaTriangulo(4, 6));
	}

	// Devuelve el area de un triángulo con los argumentos de base y altura
	// recibidos.
	static double areaTriangulo(double base, double altura) {

		return base * altura / 2;
	}
}
