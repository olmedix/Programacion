package ejemplo04Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona
		// y le asignamos un objeto de tipo Persona.
		Persona persona1 = new Persona("Sánchez","Mario","3546462616H","10/12/1981");


		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2; // Declaramos la variable de tipo Persona
		persona2 = new Persona("Martínez Lopez","Marina"); // Le asignamos un nuevo objeto en tipo Persona.

		System.out.println("Nuestra persona 2 se llama " + persona2.apellidos + " " + persona2.apellidos + ".");

		// Al crear a persona2, no le dimos un valor a fechaNacimiento,
		// Por lo que será null.
		System.out.println("María nació el " + persona2.fechaNacimiento + ".");
		
		Persona persona3 = new Persona("Olmedo Alba","Juan José","45645954R","11/11/1991");
		
		Persona persona4 = new Persona("Homar Morey","María del mar");
		
		Persona persona5 = new Persona("5464861348R");
		
		// Para que la siguiente instrucción funcione es necesario haber escrito el constructor
		// implícito, ya que este desaparece en el momento que creamos a mano un constructor explícito.
		Persona persona6 = new Persona();
		
		persona3.mostrar();
		persona4.mostrar();
		persona5.mostrar();
		
		

		
		
	}

}
