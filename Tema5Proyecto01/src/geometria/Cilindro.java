package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private static double PI = 3.141593;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getArea() {
		double areaRectangulo = 2 * PI * radio * altura;
		double areaBase = 2 * PI * radio * radio;
		return areaRectangulo + areaBase;
	}

	public double getVolumen() {
		return PI * radio * radio * altura;
	}

	public String toString() {
		return "El cilindro tiene una altura de " + altura + " y un radio de " + radio + ".";
	}

}
