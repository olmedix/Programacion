package ejercicio02;

public class Simulador {

	public static void main(String[] args) {

		Condensador condensador1 = new Condensador(100, 20, 45);
		Diodo diodo1 = new Diodo(125, 24, 15);
		Led led1 = new Led(123, 5, 48, "rojo");

		Componente com1 = diodo1;
		diodo1 = led1;

		diodo1.leeDatos();
		
	}

}
