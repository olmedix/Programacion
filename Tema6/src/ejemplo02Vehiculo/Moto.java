package ejemplo02Vehiculo;


// Como prueba hemos hecho esta clase de tipo final.
// Esto significa que no podemos crear clases hijas.
public final class Moto extends Vehiculo {

	private boolean baul;

	public Moto(String matricula, int capacidad, double peso, String marca, String modelo, int potencia, boolean baul) {

		super(matricula, capacidad, peso, marca, modelo, potencia);
		this.baul = baul;
	}

	@Override
	public String toString() {
		String salida = super.toString();

		if (baul) {
			return salida = salida + "\nbaul: " + "Sí.";
		}

		return salida = salida + "\nbaul: " + "No.";

	}

	@Override
	public void matricular() {
		// TODO Auto-generated method stub
		
	}

}
