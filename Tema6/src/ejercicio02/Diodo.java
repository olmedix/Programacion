package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente conectad.");
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.print("Introduce la Intensidad máxima: ");
			double intensidadMaxima = entrada.nextDouble();

			System.out.print("Introduce la longitud: ");
			double longitud = entrada.nextDouble();

			System.out.print("Introduce la Tensión inversa: ");
			double tensionInversa = entrada.nextDouble();

			// Actualizamos los datos solo si no ocurre ningún error.
			setIntensidadMaxima(intensidadMaxima);
			setLongitud(longitud);
			this.tensionInversa = tensionInversa;

		} catch (InputMismatchException ime) {
			System.out.println("Entrada Incorrecta.");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("Fin de lectura de datos");
		}

	}
}
