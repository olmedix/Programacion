package ejemplo01Persona;

public class Directivo extends Empleado {

	private int bonus;

	public Directivo(String apellidos, String nombre, String dni, int codEmpleado, int bonus) {

		super(apellidos, nombre, dni, codEmpleado);
		this.bonus = bonus;
	}
	


}
