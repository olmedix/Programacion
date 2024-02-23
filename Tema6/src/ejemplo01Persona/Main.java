package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

//		Persona p1 = new Persona("López Martínez", "Juan", "10100100Y");
//		p1.mostrar();

		Cliente cliente1 = new Cliente("Pérez Ortiz", "Ruben", "20200200T", "3012-1211-1732-1230");
		cliente1.mostrar();

		Empleado emple1 = new Empleado("Romero Hernández", "Rosa", "101414141E", 1001);
		emple1.mostrar();

		Directivo directivo1 = new Directivo("Rodríguez", "Miguel", "123456789T", 51, 200);
		directivo1.mostrar();

	}

}
