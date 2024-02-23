package ejemplo01Persona;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// Métodos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre);
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene
	boolean tieneDni() {
		if (dni == null) {
			return false;
		}
		return true;

	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está)
	// en formato dd/mm/aaaa.
	String anyoNacimiento() {
		if (fechaNacimiento != null) {
			return fechaNacimiento.substring(6);
		}
		return null;

	}

}
