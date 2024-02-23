package ejemplo01Persona;

public class Empleado extends Persona {

	private int codEmpleado;

	public Empleado(String apellidos, String nombre, String dni, int codEmpleado) {
		super(apellidos, nombre, dni);
		this.codEmpleado = codEmpleado;
	}

	@Override
	public void mostrar() {
		
		System.out.println("\n"+getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("\nCódigo de empleado: " + codEmpleado);
	}

}
