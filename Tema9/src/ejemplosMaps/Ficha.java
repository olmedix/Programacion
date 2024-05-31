package ejemplosMaps;

public class Ficha {

	private int anyoNacimiento;
	private String nacionailidad;
	private String visa;

	public Ficha(int anyoNacimiento, String nacionailidad, String visa) {

		this.anyoNacimiento = anyoNacimiento;
		this.nacionailidad = nacionailidad;
		this.visa = visa;
	}

	public String toString() {
		return "Año de nacimiento: " + anyoNacimiento + "\nNacionalidad: " + nacionailidad + "\nVISA: " + visa;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getNacionailidad() {
		return nacionailidad;
	}

	public void setNacionailidad(String nacionailidad) {
		this.nacionailidad = nacionailidad;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}
