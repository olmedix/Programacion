package ejemplo06Circulo;

public class Circulo {

	// Constante PI
	final double PI = 3.141593;

	// Coordenada x, y del círculo.
	double x;
	double y;

	// Radio del círculo
	double radio;
	
	// Construsctor implícito
	Circulo(){
		
	}

	// Constructor con todos los atributos.
	Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	// Constructor que recibe solo el valor de radio.
	Circulo(double radio){
		this(0,0,radio);
	}
	
	// Devuelve el area de un círculo.
	double area() {
		return PI * radio * radio;
	}
	
	//Devuelve el perímetro del círculo.
	double perimetro() {
		return 2*PI*radio;
	}

	
}
