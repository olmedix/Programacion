package ejemplo03PolimorfismoPersona;

public class Cliente extends Persona {

	private String visa;

	public Cliente(String apellidos, String nombre, String DNI, String visa) {

		// Pasamos los apellidos, nombre y DNI como argumento al constructor de la clase
		// padre, Persona.
		super(apellidos, nombre, DNI);

		// Inicializamos a mano el resto de atributos que no son heredados.
		this.visa = visa;
	}


	public void mostrar() {

		System.out.println("\n"+getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("\nVisa: " + visa + ".");
	}

}