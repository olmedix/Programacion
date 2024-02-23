package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int anyoNacimiento;

	public Autor(String nombre, String email, int anyoNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.anyoNacimiento = anyoNacimiento;
	}

	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setanyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String toString() {
		return "El nombre es " + nombre + ", su email es " + email + " y su año es " + anyoNacimiento;
	}

}
