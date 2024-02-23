package ejemplo03PolimorfismoPersona;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Pérez Ortiz", "Ruben", "20200200T", "3012-1211-1732-1230");
		cliente1.mostrar();

		Empleado emple1 = new Empleado("Romero Hernández", "Rosa", "101414141E", 1001);
		emple1.mostrar();

		Directivo directivo1 = new Directivo("Rodríguez", "Miguel", "123456789T", 51, 200);
		directivo1.mostrar();

		// Ejemplos de polimorfismo

		// p1 , que es de tipo Persona le puedo asignar un objeto de tipo Cliente
		// ya que Cliente es un tipo de Persona ( hereda de Persona ).
		Persona p1 = cliente1;

		// p2 , que es de tipo Persona le puedo asignar un objeto de tipo Directivo
		// ya que Directivo es un tipo de Empleado, que a su vez,
		// es un tipo de Persona ( hereda de Persona ).
		Persona p2 = directivo1;

		// Si llamamos al método mostrar() de p2, se ejecuta el de Directivo.
		p2.mostrar();

		// Si llamamos al método mostrar() de p2, se ejecuta el de Cliente.
		p1.mostrar();

		// Sólo se puede llamar a métodos de p1 o p2 si existen en la clase padre
		// (Persona).

		// Un objeto de tipo Persona no necesariamente puede asignarase a una variable
		// Cliente
		// No cualquier persona es un cliente.
		Persona p3 = new Persona();
		// Cliente cliente2 = p3;

		// Podemos asignar a una variable de tipo Cliente otra variable de tipo Persona.
		// Haciendo un cast a Cliente. Siempre que sepamos que realmente la variable
		// de tipo Persona apunta a un objeto Cliente.
		Cliente cliente3 = (Cliente) p1;

		// Lo siguiente dará error, ya que p2 está apuntando a un objeto de tipo
		// Directivo
		// no de tipo Cliente.
		// Cliente cliente4 = (Cliente) p2

		// Podemos crear una array de tipo Persona y guardar ahí tanto Clientes ,
		// como Empleados, como Directivos.
		Persona[] personas = new Persona[10];

		personas[0] = cliente1;
		personas[1] = directivo1;
		personas[2] = new Empleado("Jiménez", "Pedro", "1025546T", 5);

		Empleado empleado1 = (Empleado) personas[2];
		
		
	}

}
