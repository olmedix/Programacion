package ejemplo11Circulo;

public class Circulo {

	// Constante PI
	public final double PI = 3.141593;

	// Coordenada x, y del círculo.
	private double x;
	private double y;

	// Radio del círculo
	private double radio;

	// Construsctor implícito
	public Circulo() {

	}

	// Constructor con todos los atributos.
	public Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	// Constructor que recibe solo el valor de radio.
	public Circulo(double radio) {
		this(0, 0, radio);
	}

	// Devuelve el area de un círculo.
	public double area() {
		return PI * radio * radio;
	}

	// Devuelve el perímetro del círculo.
	public double perimetro() {
		return 2 * PI * radio;
	}
	
	//MÉTODOS DE ACCESO (GETTERS Y SETTERS).

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	
	
	
}
