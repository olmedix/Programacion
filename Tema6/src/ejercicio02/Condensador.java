package ejercicio02;

public class Condensador extends Componente implements Invertible {

	private double capacidad;

	public Condensador(double intensidadMaxima, double longitud, double capacidad) {
		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;

	}
	
	@Override
	public void conectar() {
		System.out.println("Componente conectad.");
	}
	
	public void girar() {
		System.out.println("Componente girado.");
	}
}
