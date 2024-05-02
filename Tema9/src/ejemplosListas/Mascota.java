package ejemplosListas;

import java.util.Objects;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;

	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// TODO: Crear un método equals que compara dos mascotas mirando sus tres
	// atributos.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Mascota other = (Mascota) obj;
		if (nombre.equals(other.getNombre()) && edad == other.edad && nombre.equals(other.getNombre())) {
			return true;
		}
		return false;
	}

	// Cambiar la clase Libreta para que usea ArrayList en vez de Array.

}
