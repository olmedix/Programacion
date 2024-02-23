package ejemplo10Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	private String matricula;
	private String marca;
	private String modelo;
	private String averia;
	private int quilometros;

	// Constructor con todos los atributos de la clase.
	public Coche(String matricula, String marca, String modelo, String averia, int quilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;
	}

	// Constructor explícito que tome la matricula,marca y modelo y el resto de
	// valores sin modificar.
	public Coche(String matricula, String marca, String modelo) {

		this(matricula, marca, modelo, null, 0);
	}

	// leerDatos() pregunta al usuario los valores de las propiedades y los lee
	// desde la terminal.
	public void leerDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE");

		System.out.print("Matrícula:");
		matricula = entrada.nextLine();

		System.out.print("Marca: ");
		marca = entrada.nextLine();

		System.out.print("Modelo: ");
		modelo = entrada.nextLine();

		System.out.print("Avería: ");
		averia = entrada.nextLine();

		System.out.print("quilómetros: ");
		quilometros = entrada.nextInt();
	}

	// Muestra todas las propiedades del objeto.
	public void mostrar() {
		System.out.println("MOSTRAR LOS DATOS DEL COCHE\n");

		System.out.println("Matrícula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Avería: " + averia);
		System.out.println("quilómetros: " + quilometros);

	}

	// MÉTODOS DE ACCESO (GETTERS Y SETTERS)

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		
		// Comprobamos que los quilómetros no sean números negativos.
		if(quilometros < 0) {
			return;
		}
		this.quilometros = quilometros;
	}

}
